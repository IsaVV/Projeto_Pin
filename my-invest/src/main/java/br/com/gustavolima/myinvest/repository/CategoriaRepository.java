package br.com.gustavolima.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavolima.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
}
