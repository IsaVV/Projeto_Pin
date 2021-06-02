package br.com.pin.controllers;

public class Lote {
    private String lote;

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lote == null) ? 0 : lote.hashCode());
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
        Lote other = (Lote) obj;
        if (lote == null) {
            if (other.lote != null)
                return false;
        } else if (!lote.equals(other.lote))
            return false;
        return true;
    }

    
}
