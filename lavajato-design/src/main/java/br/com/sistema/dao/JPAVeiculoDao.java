package br.com.sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.sistema.entidades.Veiculo;

@Repository
public class JPAVeiculoDao implements VeiculoDao {

	@PersistenceContext
	EntityManager manager;

	public void adiciona(Veiculo cliente) {
		manager.persist(cliente);
	}

	public void altera(Veiculo cliente) {
		manager.merge(cliente);
	}

	public void remove(Veiculo cliente) {
		manager.remove(cliente);
	}

	public List<Veiculo> todos() {
		return manager.createQuery("from Veiculo", Veiculo.class)
				.getResultList();
	}

	public Veiculo porPlaca(String f) {
		return manager.find(Veiculo.class, f);
	}
}
