package com.leporonitech.springmvc.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "alb_albuns")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alb_id")
	private Long id;

	@NotEmpty(message = "Nome obrigatório")
	@NotNull(message = "Nome obrigatório")
	@Size(min = 4, max = 10, message = "Deve conter entre 1 e 20 caracteres")
	@Column(name = "alb_nome", length = 20, nullable = false)
	private String nome;

	@NotNull(message = "ano de lançamento obrigatório")
	@Min(value = 1950, message = "Lançamento a partir de 1950")
	@Max(value = 2050, message = "Lançamento até 2050")
	@Column(name = "alb_ano_lancamento", nullable = false)
	private int dataLancamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(int dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

}
