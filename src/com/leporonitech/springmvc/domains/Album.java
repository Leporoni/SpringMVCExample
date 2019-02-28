package com.leporonitech.springmvc.domains;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Album {

	@NotEmpty(message = "Nome obrigat�rio")
	@NotNull(message = "Nome obrigat�rio")
	@Size(min = 4, max = 10, message = "Deve conter entre 4 e 10 caracteres")
	private String nome;

	@NotNull(message = "ano de lan�amento obrigat�rio")
	@Min(value = 1950, message = "Lan�amento a partir de 1950")
	@Max(value = 2050, message = "Lan�amento at� 2050")
	private int dataLancamento;

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
