package com.seuprojeto.saida.domain.model;

public class RegraCarencia {
    private String tipoPrimeiraCarencia;
    private int quantidadePrimeiraCarencia;
    private String tipoDemaisCarencia;
    private int quantidadeDemaisCarencia;

    public String getTipoPrimeiraCarencia() {
        return tipoPrimeiraCarencia;
    }

    public void setTipoPrimeiraCarencia(String tipoPrimeiraCarencia) {
        this.tipoPrimeiraCarencia = tipoPrimeiraCarencia;
    }

    public int getQuantidadePrimeiraCarencia() {
        return quantidadePrimeiraCarencia;
    }

    public void setQuantidadePrimeiraCarencia(int quantidadePrimeiraCarencia) {
        this.quantidadePrimeiraCarencia = quantidadePrimeiraCarencia;
    }

    public String getTipoDemaisCarencia() {
        return tipoDemaisCarencia;
    }

    public void setTipoDemaisCarencia(String tipoDemaisCarencia) {
        this.tipoDemaisCarencia = tipoDemaisCarencia;
    }

    public int getQuantidadeDemaisCarencia() {
        return quantidadeDemaisCarencia;
    }

    public void setQuantidadeDemaisCarencia(int quantidadeDemaisCarencia) {
        this.quantidadeDemaisCarencia = quantidadeDemaisCarencia;
    }
}
