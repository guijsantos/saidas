package com.seuprojeto.saida.domain.model;

public class IdSusep {
    private String id;
    private int codidgoProduto;
    private String nomeProduto;
    private int codigoEnquadramentoFip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCodidgoProduto() {
        return codidgoProduto;
    }

    public void setCodidgoProduto(int codidgoProduto) {
        this.codidgoProduto = codidgoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodigoEnquadramentoFip() {
        return codigoEnquadramentoFip;
    }

    public void setCodigoEnquadramentoFip(int codigoEnquadramentoFip) {
        this.codigoEnquadramentoFip = codigoEnquadramentoFip;
    }
}
