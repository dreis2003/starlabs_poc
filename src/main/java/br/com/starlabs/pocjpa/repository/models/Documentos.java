package br.com.starlabs.pocjpa.repository.models;

import org.hibernate.validator.constraints.br.CPF;

public class Documentos {
	
	@CPF
	private String cpf;
	
	private String rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
