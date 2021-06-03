package br.com.pin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pin.controllers.RegistroParada;

public interface RegistroRepository extends JpaRepository<RegistroParada, Integer>{
    
    @Query("FROM RegistroParada WHERE localProducao = ?1")
    List<RegistroParada> findByLocalProducao(String localProducao);

    @Query("FROM RegistroParada WHERE componente = ?1")
    List<RegistroParada> findByComponente(String componente);

    @Query("FROM RegistroParada WHERE lote = ?1")
    List<RegistroParada> findByLote(String lote);

    @Query("FROM RegistroParada WHERE causa.tipo = ?1")
    List<RegistroParada> findByCausaTipo(String tipo);
}
