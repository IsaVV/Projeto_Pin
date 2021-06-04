package br.com.pin.controllers;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class RegistroParada {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
    private String componente;
    @OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name= "equipamento")
    private Equipamento equipamento;
    @OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name= "causa")
    private Causa causa;
    private String localProducao;
    private String localCausador;
    private String lote;
    @OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name= "hora")
    private DataHora dataHora;
    @OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name= "ordemProducao")
    private OrdemProducao ordemProducao;
    private String descricao;
	
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
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

    public String getLocalProducao() {
        return localProducao;
    }

    public void setLocalProducao(String localProducao) {
        this.localProducao = localProducao;
    }

    public String getLocalCausador() {
        return localCausador;
    }

    public void setLocalCausador(String localCausador) {
        this.localCausador = localCausador;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
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
