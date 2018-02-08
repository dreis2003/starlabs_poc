package br.com.starlabs.pocjpa.repository.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class DadosPessoais {
	
	@Embedded
	private Documentos documentos;
	
	@Embedded
	private Endereco endereco;

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
