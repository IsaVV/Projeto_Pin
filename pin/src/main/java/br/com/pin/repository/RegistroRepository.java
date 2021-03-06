package br.com.pin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pin.controllers.RegistroParada;
public interface RegistroRepository extends JpaRepository<RegistroParada, Integer>{
    
    @Query("FROM RegistroParada WHERE localProducao = ?1")
    List<RegistroParada> findByLocalProducao(String localProducao);

    @Query("FROM RegistroParada WHERE localCausador = ?1")
    List<RegistroParada> findByLocalCausador(String localCausador);

    @Query("FROM RegistroParada WHERE componente = ?1")
    List<RegistroParada> findByComponente(String componente);

    @Query("FROM RegistroParada WHERE lote = ?1")
    List<RegistroParada> findByLote(String lote);

    @Query("FROM RegistroParada WHERE causa.tipo = ?1")
    List<RegistroParada> findByCausaTipo(String tipo);

    @Query("FROM RegistroParada WHERE causa.atributo = ?1")
    List<RegistroParada> findByCausaAtributo(String atributo);

    @Query("FROM RegistroParada WHERE causa.disfuncao = ?1")
    List<RegistroParada> findByCausaDisfuncao(String disfuncao);

    @Query("FROM RegistroParada WHERE dataHora.dataInicio = ?1")
    List<RegistroParada> findByDataHoraDataInicio(String dataInicio);

    @Query("FROM RegistroParada WHERE dataHora.dataFinal = ?1")
    List<RegistroParada> findByDataHoraDataFinal(String dataFinal);

    @Query("FROM RegistroParada WHERE dataHora.horaInicial = ?1")
    List<RegistroParada> findByDataHoraHoraInicial(String horaInicial);

    @Query("FROM RegistroParada WHERE dataHora.horaFinal = ?1")
    List<RegistroParada> findByDataHoraHoraFinal(String horaFinal);

    @Query("FROM RegistroParada WHERE equipamento.nome = ?1")
    List<RegistroParada> findByEquipamenoNome(String nome);

    @Query("FROM RegistroParada WHERE equipamento.local = ?1")
    List<RegistroParada> findByEquipamenoLocal(String local);

    @Query("FROM RegistroParada WHERE equipamento.tipo = ?1")
    List<RegistroParada> findByEquipamenoTipo(String tipo);

    @Query("FROM RegistroParada WHERE ordemProducao.ordem = ?1")
    List<RegistroParada> findByOrdemProducaoOrdem(String ordem);

    @Query("FROM RegistroParada WHERE ordemProducao.material = ?1")
    List<RegistroParada> findByOrdemProducaoMaterial(String material);

    @Query("FROM RegistroParada WHERE ordemProducao.sequencial = ?1")
    List<RegistroParada> findByOrdemProducaoSequencial(String sequencial);

    @Query("FROM RegistroParada WHERE ordemProducao.turma = ?1")
    List<RegistroParada> findByOrdemProducaoTurma(String turma);


}
