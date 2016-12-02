package br.com.sistema.dao;

import java.util.List;

import br.com.sistema.entidades.Servico;

public interface ServicoDao {
	void adiciona(Servico servico);
	void altera(Servico servico);
	void remove(Servico servico);
	List<Servico> todos();
	Servico porTelefone(String f);
}
