package br.com.sistema.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "clientes")
public class Cliente{
	@Id @GeneratedValue
	private Long id;
	
	@NotBlank(message = "O telefone deve ser informado.")
	@Column(length = 15, unique = true)
	private String telefone;
	
	@NotBlank(message = "O nome deve ser informado.")
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "cliente")
	private List<Veiculo> veiculos;
	

	public void setId(Long id) {
		this.id = id;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public String getTelefone() {
		return telefone;
	}
}
