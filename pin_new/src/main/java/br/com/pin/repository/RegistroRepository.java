package br.com.pin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pin.controllers.RegistroParada;

public interface RegistroRepository extends JpaRepository<RegistroParada, Long>{
    
}
