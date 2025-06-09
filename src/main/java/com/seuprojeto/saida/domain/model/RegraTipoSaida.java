package com.seuprojeto.saida.domain.model;

public class RegraTipoSaida {
    private boolean permiteSaidaParcial;
    private boolean permiteSaidaTotal;

    public boolean isPermiteSaidaParcial() {
        return permiteSaidaParcial;
    }

    public void setPermiteSaidaParcial(boolean permiteSaidaParcial) {
        this.permiteSaidaParcial = permiteSaidaParcial;
    }

    public boolean isPermiteSaidaTotal() {
        return permiteSaidaTotal;
    }

    public void setPermiteSaidaTotal(boolean permiteSaidaTotal) {
        this.permiteSaidaTotal = permiteSaidaTotal;
    }
}
