package br.com.starlabs.pocjpa.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.starlabs.pocjpa.PocJpaApplicationTests;
import br.com.starlabs.pocjpa.repository.models.DadosPessoais;
import br.com.starlabs.pocjpa.repository.models.Documentos;
import br.com.starlabs.pocjpa.repository.models.Endereco;
import br.com.starlabs.pocjpa.repository.models.Estado;
import br.com.starlabs.pocjpa.repository.models.Pessoa;

public class PessoaServiceImplTest extends PocJpaApplicationTests{
	
	
	@Autowired
	private PessoaService pessoaService;
	
	@Test
	public void testSalvaPessoa() {
		//Limpa a tabela para inserir novo registro
		pessoaService.limpaTabela();
		
		Pessoa pessoa = criaPessoa();
		
		pessoaService.salvarPessoa(pessoa);
		
		Optional<Pessoa> find = pessoaService.buscaPorNome("Daniel Reis");
		
		assertEquals("Daniel Reis", find.get().getNome());
		
	}
	

	private Pessoa criaPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Daniel Reis");
		
		DadosPessoais dp = new DadosPessoais();
		Documentos docs = new Documentos();
		docs.setCpf("164.910.438-35");
		docs.setRg("23.584.711-2");
		
		Endereco end = new Endereco();
		end.setBairro("Vila São Judas Tadeu");
		end.setEstado(Estado.SP);
		end.setLogradouro("Av. da Paz, 209");
		end.setCep("07061-032");
		
		dp.setDocumentos(docs);
		dp.setEndereco(end);
		
		pessoa.setDadosPessoais(dp);

		return pessoa;
		
	}
	
}
