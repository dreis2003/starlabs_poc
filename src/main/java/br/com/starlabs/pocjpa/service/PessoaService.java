package br.com.starlabs.pocjpa.service;

import java.util.Optional;

import br.com.starlabs.pocjpa.repository.models.Pessoa;

public interface PessoaService {
	
	void salvarPessoa(Pessoa pessoa) ;
	
	Pessoa buscaPorId(Long id) ;
	
	Optional<Pessoa> buscaPorNome(String nome) ;

	void limpaTabela();

}
