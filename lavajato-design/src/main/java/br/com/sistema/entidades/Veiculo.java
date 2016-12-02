package br.com.sistema.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="veiculos")
public class Veiculo {
	@Id
	@Column(length=8)
	private String placa;
	
	@Column(nullable=false,length=50)
	private String cor;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@Column(nullable=false,length=100)
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name="telefone",nullable=false)
	private Cliente cliente;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
