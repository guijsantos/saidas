
package com.seuprojeto.saida.application;

import com.seuprojeto.saida.api.dto.ValidacaoRequest;
import com.seuprojeto.saida.domain.model.Saida;
import com.seuprojeto.saida.domain.regra.RegraValidacao;
import com.seuprojeto.saida.infrastructure.api.MatriculaClient;
import com.seuprojeto.saida.infrastructure.aws.ParameterStoreClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ValidacaoSaidaService {

    private final ParameterStoreClient parameterStoreClient;
    private final Map<String, RegraValidacao> regrasMap;
    private final MatriculaClient matriculaClient;


    public ValidacaoSaidaService(List<RegraValidacao> regras, ParameterStoreClient parameterStoreClient, MatriculaClient matriculaClient) {
        this.parameterStoreClient = parameterStoreClient;
        this.regrasMap = regras.stream()
                .collect(Collectors.toMap(
                        r -> r.getClass().getAnnotation(Component.class).value(),
                        r -> r));
        this.matriculaClient = matriculaClient;
    }

    public Saida validar(ValidacaoRequest validacaoRequest) {
        List<String> regras = parameterStoreClient.getParametro(validacaoRequest.getTipoSaida());

        Saida saida = matriculaClient.buscarDados(validacaoRequest.getIdMatricula());

        for (String nomeRegra : regras) {
            RegraValidacao regra = regrasMap.get(nomeRegra);
            if (regra == null) throw new RuntimeException("Regra não encontrada: " + nomeRegra);
            regra.aplicar(saida);
        }
        return saida;
    }
}
