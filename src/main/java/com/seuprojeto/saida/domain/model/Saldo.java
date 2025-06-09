package com.seuprojeto.saida.domain.model;

import java.math.BigDecimal;

public class Saldo {

    private BigDecimal valorTotal;
    private BigDecimal valorBloqueado;
    private BigDecimal valorDisponivel;

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorBloqueado() {
        return valorBloqueado;
    }

    public void setValorBloqueado(BigDecimal valorBloqueado) {
        this.valorBloqueado = valorBloqueado;
    }

    public BigDecimal getValorDisponivel() {
        return valorDisponivel;
    }

    public void setValorDisponivel(BigDecimal valorDisponivel) {
        this.valorDisponivel = valorDisponivel;
    }
}
