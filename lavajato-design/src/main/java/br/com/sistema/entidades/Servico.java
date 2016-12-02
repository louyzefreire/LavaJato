package br.com.sistema.entidades;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="servicos")
public class Servico {
	@Id
	@GeneratedValue
	private Long id;
	
	@Digits(integer = 10, fraction = 2)
	@Column(nullable=false, columnDefinition="Decimal(10,2)")
	private BigDecimal preco;
	
	@NotNull
	@Column(nullable=false,length=30)
	private String descricao;
	
	@NotNull
	@Column(nullable=false,length=25)
	private String previsao_entrega; 
	
	@Column(insertable=false, updatable=false, columnDefinition="timestamp default current_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_servico;
	
	@ManyToOne
	@JoinColumn(name="placa",nullable=false)
	private Veiculo veiculo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getPrevisao_entrega() {
		return previsao_entrega;
	}

	public void setPrevisao_entrega(String previsao_entrega) {
		this.previsao_entrega = previsao_entrega;
	}

	public Date getData_servico() {
		return data_servico;
	}

	public void setData_servico(Date data_servico) {
		this.data_servico = data_servico;
	}
}
