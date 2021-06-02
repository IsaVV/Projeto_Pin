package br.com.pin.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroParada {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private Componente componente;
    private Equipamento equipamento;
    private Causa causa;
    private LocalProducao localProducao;
    private LocalCausador localCausador;
    private Lote lote;
    private DataHora dataHora;
    private OrdemProducao ordemProducao;
    private Descricao descricao;

   
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Componente getComponente() {
		return componente;
	}
	
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
	public Equipamento getEquipamento() {
		return equipamento;
	}
	
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public Causa getCausa() {
		return causa;
	}
	
	public void setCausa(Causa causa) {
		this.causa = causa;
	}
	
	public LocalProducao getLocalProducao() {
		return localProducao;
	}
	
	public void setLocalProducao(LocalProducao localProducao) {
		this.localProducao = localProducao;
	}
	
	public LocalCausador getLocalCausador() {
		return localCausador;
	}
	
	public void setLocalCausador(LocalCausador localCausador) {
		this.localCausador = localCausador;
	}
	
	public Lote getLote() {
		return lote;
	}
	
	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	public DataHora getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(DataHora dataHora) {
		this.dataHora = dataHora;
	}
	
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	
	public Descricao getDescricao() {
		return descricao;
	}
	
	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((causa == null) ? 0 : causa.hashCode());
		result = prime * result + ((componente == null) ? 0 : componente.hashCode());
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((equipamento == null) ? 0 : equipamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localCausador == null) ? 0 : localCausador.hashCode());
		result = prime * result + ((localProducao == null) ? 0 : localProducao.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((ordemProducao == null) ? 0 : ordemProducao.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroParada other = (RegistroParada) obj;
		if (causa == null) {
			if (other.causa != null)
				return false;
		} else if (!causa.equals(other.causa))
			return false;
		if (componente == null) {
			if (other.componente != null)
				return false;
		} else if (!componente.equals(other.componente))
			return false;
		if (dataHora == null) {
			if (other.dataHora != null)
				return false;
		} else if (!dataHora.equals(other.dataHora))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (equipamento == null) {
			if (other.equipamento != null)
				return false;
		} else if (!equipamento.equals(other.equipamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localCausador == null) {
			if (other.localCausador != null)
				return false;
		} else if (!localCausador.equals(other.localCausador))
			return false;
		if (localProducao == null) {
			if (other.localProducao != null)
				return false;
		} else if (!localProducao.equals(other.localProducao))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (ordemProducao == null) {
			if (other.ordemProducao != null)
				return false;
		} else if (!ordemProducao.equals(other.ordemProducao))
			return false;
		return true;
	}
   
}
