package com.seuprojeto.saida.domain.model;

public class Fundo {
    private String idFundo;
    private String codigoFundo;
    private int diaEfetivacao;
    private int diaCota;

    public String getIdFundo() {
        return idFundo;
    }

    public void setIdFundo(String idFundo) {
        this.idFundo = idFundo;
    }

    public String getCodigoFundo() {
        return codigoFundo;
    }

    public void setCodigoFundo(String codigoFundo) {
        this.codigoFundo = codigoFundo;
    }

    public int getDiaEfetivacao() {
        return diaEfetivacao;
    }

    public void setDiaEfetivacao(int diaEfetivacao) {
        this.diaEfetivacao = diaEfetivacao;
    }

    public int getDiaCota() {
        return diaCota;
    }

    public void setDiaCota(int diaCota) {
        this.diaCota = diaCota;
    }
}
