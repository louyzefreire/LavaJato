package br.com.sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.sistema.entidades.Cliente;

@Repository
public class JPAClienteDao implements ClienteDao {

	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Cliente cliente) {
		manager.persist(cliente);
	}

	public void altera(Cliente cliente) {
		manager.merge(cliente);
	}

	public void remove(Cliente cliente) {
		manager.remove(cliente);
	}

	public List<Cliente> todos() {
		return manager.createQuery("from Cliente", Cliente.class)
				.getResultList();
	}

	public Cliente porFone(String telefone) {
		try{
		TypedQuery<Cliente> query = manager.createQuery(
				"SELECT c FROM Cliente c WHERE c.telefone = :telefone",
				Cliente.class);
		return query.setParameter("telefone", telefone).getSingleResult();
		}catch (NoResultException e) {
			System.out.println("Consulta não encontrada!");
			      return null;
		}
	}
	
	public Cliente porNome(String nome) {
		try{
		TypedQuery<Cliente> query = manager.createQuery(
				"SELECT c FROM Cliente c WHERE c.nome = :nome",
				Cliente.class);
		return query.setParameter("nome", nome).getSingleResult();
		}catch (NoResultException e) {
			System.out.println("Consulta não encontrada!");
			      return null;
		}
	}
	
	public void altualiza(Cliente cliente) {
		manager.merge(cliente);
	}
}
