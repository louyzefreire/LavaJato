package br.com.sistema.dao;

import java.util.List;

import br.com.sistema.entidades.Veiculo;

public interface VeiculoDao {
	void adiciona(Veiculo veiculo);
	void altera(Veiculo veiculo);
	void remove(Veiculo veiculo);
	List<Veiculo> todos();
	Veiculo porPlaca(String f);
}
