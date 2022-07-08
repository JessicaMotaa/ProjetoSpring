package br.com.app_cadastro.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app_cadastro.domain.entity.Pessoa;

@Repository
public interface  PessoaRepository  extends JpaRepository<Pessoa, Long>{

	//Faz a paginação e busca pelo nome
	Page<Pessoa> findByNome(String nome, Pageable pageable);

}
