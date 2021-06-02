package br.com.pin.controllers;

public class DataHora {

    private String dataInicio;
    private String dataFinal;
    private String horaFinal;
    private String horaInicial;

    DataHora(String dataInicio, String dataFinal, String horaInicial, String horaFinal) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
        result = prime * result + ((horaFinal == null) ? 0 : horaFinal.hashCode());
        result = prime * result + ((horaInicial == null) ? 0 : horaInicial.hashCode());
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
        DataHora other = (DataHora) obj;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (dataInicio == null) {
            if (other.dataInicio != null)
                return false;
        } else if (!dataInicio.equals(other.dataInicio))
            return false;
        if (horaFinal == null) {
            if (other.horaFinal != null)
                return false;
        } else if (!horaFinal.equals(other.horaFinal))
            return false;
        if (horaInicial == null) {
            if (other.horaInicial != null)
                return false;
        } else if (!horaInicial.equals(other.horaInicial))
            return false;
        return true;
    }

}