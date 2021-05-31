package br.com.gustavolima.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavolima.myinvest.domain.Investimentos;

public interface InvestimentoRepository extends JpaRepository<Investimentos, Long> {

}
