package br.com.sistema.dao;

import java.util.List;

import br.com.sistema.entidades.Cliente;

public interface ClienteDao{
	void adiciona(Cliente cliente);
	void altera(Cliente cliente);
	void remove(Cliente cliente);
	List<Cliente> todos();
	Cliente porFone(String telefone);
	Cliente porNome(String nome);
}
