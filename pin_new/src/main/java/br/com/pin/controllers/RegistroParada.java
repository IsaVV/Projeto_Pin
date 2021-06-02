package br.com.pin.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Scanner;

@Entity
public class RegistroParada {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String componente;
    private Equipamento equipamento;
    private Causa causa;
    private String localProducao;
    private String localCausador;
    private String lote;
    private DataHora dataHora;
    private OrdemProducao ordemProducao;
    private String descricao;
	
}
