package com.seuprojeto.saida.domain.model;

import java.util.Date;

public class Matricula {
    private String id;
    private String situacao;
    private IdSusep idSusep;
    private Pessoa pessoa;
    private String tipoTributacao;
    private Date data_criacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Pessoa getPessoas() {
        return pessoa;
    }

    public void setPessoas(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public IdSusep getIdSusep() {
        return idSusep;
    }

    public void setIdSusep(IdSusep idSusep) {
        this.idSusep = idSusep;
    }

    public String getTipoTributacao() {
        return tipoTributacao;
    }

    public void setTipoTributacao(String tipoTributacao) {
        this.tipoTributacao = tipoTributacao;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }
}
