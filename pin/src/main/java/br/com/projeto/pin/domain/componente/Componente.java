package br.com.projeto.pin.domain.componente;

public class Componente {
    private String peca;

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((peca == null) ? 0 : peca.hashCode());
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
        Componente other = (Componente) obj;
        if (peca == null) {
            if (other.peca != null)
                return false;
        } else if (!peca.equals(other.peca))
            return false;
        return true;
    }

    
}
