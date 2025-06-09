
package com.seuprojeto.saida.api.dto;

import com.seuprojeto.saida.domain.model.Saida;

public class ValidacaoResponse {
    private final Saida saida;

    public ValidacaoResponse(Saida saida) {
        this.saida = saida;
    }

    public Saida getSaida() {
        return this.saida;
    }
}
