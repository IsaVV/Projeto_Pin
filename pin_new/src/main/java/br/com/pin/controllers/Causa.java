package br.com.pin.controllers;

public class Causa {
    private String tipo;
    private String atributo;
    private String disfuncao;
    
    Causa(String tipo, String atributo, String disfuncao) {
        this.tipo = tipo;
        this.atributo = atributo;
        this.disfuncao = disfuncao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getDisfuncao() {
        return disfuncao;
    }

    public void setDisfuncao(String disfuncao) {
        this.disfuncao = disfuncao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atributo == null) ? 0 : atributo.hashCode());
        result = prime * result + ((disfuncao == null) ? 0 : disfuncao.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Causa other = (Causa) obj;
        if (atributo == null) {
            if (other.atributo != null)
                return false;
        } else if (!atributo.equals(other.atributo))
            return false;
        if (disfuncao == null) {
            if (other.disfuncao != null)
                return false;
        } else if (!disfuncao.equals(other.disfuncao))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    
}
