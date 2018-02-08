package br.com.starlabs.pocjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starlabs.pocjpa.repository.dao.PessoaRepository;
import br.com.starlabs.pocjpa.repository.models.Pessoa;

@Service("pessoaService")
public class PessoaServiceImpl implements PessoaService{

	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	
	public void salvarPessoa(Pessoa pessoa) {
		pessoaRepository.saveAndFlush(pessoa);
	}
	
	public Pessoa buscaPorId(Long id) {
		return pessoaRepository.findOne(id);
	}
	
	public Optional<Pessoa> buscaPorNome(String nome) {
		return pessoaRepository.findByNome(nome);
	}

	@Override
	public void limpaTabela() {
		pessoaRepository.deleteAll();
		
	}
	
	
}
