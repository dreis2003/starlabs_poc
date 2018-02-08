package br.com.starlabs.pocjpa.repository.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starlabs.pocjpa.repository.models.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Optional<Pessoa> findByNome(String nome);
	
}
