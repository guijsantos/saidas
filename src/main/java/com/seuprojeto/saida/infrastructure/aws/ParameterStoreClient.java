
package com.seuprojeto.saida.infrastructure.aws;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParameterStoreClient {
    public List<String> getParametro(String tipoSaida) {
        return List.of("ValidarMatricula", "ValidarSaldo", "ValidarTipoSaida");

    }
}
