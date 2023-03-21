package br.com.cursojsf;

import jakarta.annotation.ManagedBean;

@ManagedBean(value = "pessoaBean")
public class PessoaBean {

	private String nome;
	private String sobrenome;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
