package br.com.pin.controllers;

public class OrdemProducao {

    private String ordem;
    private String material;
    private String sequencial;

    public String getOrdem() {
        return ordem;
    }
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getSequencial() {
        return sequencial;
    }
    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        result = prime * result + ((ordem == null) ? 0 : ordem.hashCode());
        result = prime * result + ((sequencial == null) ? 0 : sequencial.hashCode());
        result = prime * result + ((turma == null) ? 0 : turma.hashCode());
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
        OrdemProducao other = (OrdemProducao) obj;
        if (material == null) {
            if (other.material != null)
                return false;
        } else if (!material.equals(other.material))
            return false;
        if (ordem == null) {
            if (other.ordem != null)
                return false;
        } else if (!ordem.equals(other.ordem))
            return false;
        if (sequencial == null) {
            if (other.sequencial != null)
                return false;
        } else if (!sequencial.equals(other.sequencial))
            return false;
        if (turma == null) {
            if (other.turma != null)
                return false;
        } else if (!turma.equals(other.turma))
            return false;
        return true;
    }
    private String turma;

    
}