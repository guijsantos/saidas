
package com.seuprojeto.saida.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Saida {
    private final Matricula matricula;
    private final String tipoSaida;
    private Saldo saldo;
    private Fundo fundo;
    private RegraCarencia regraCarencia;
    private RegraTipoSaida regraTipoSaida;
    private final List<String> erros = new ArrayList<>();


    public Saida(Matricula matricula, String tipoSaida) {
        this.matricula = matricula;
        this.tipoSaida = tipoSaida;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Fundo getFundo() {
        return fundo;
    }

    public void setFundo(Fundo fundo) {
        this.fundo = fundo;
    }

    public RegraCarencia getRegraCarencia() {
        return regraCarencia;
    }

    public void setRegraCarencia(RegraCarencia regraCarencia) {
        this.regraCarencia = regraCarencia;
    }

    public RegraTipoSaida getRegraTipoSaida() {
        return regraTipoSaida;
    }

    public void setRegraTipoSaida(RegraTipoSaida regraTipoSaida) {
        this.regraTipoSaida = regraTipoSaida;
    }

    public List<String> getErros() {
        return this.erros;
    }

    public void adicionarErros(String erro) {
        this.erros.add(erro);
    }
}
