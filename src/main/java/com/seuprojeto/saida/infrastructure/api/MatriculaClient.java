package com.seuprojeto.saida.infrastructure.api;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.seuprojeto.saida.domain.model.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

@Component
public class MatriculaClient {
    public Saida buscarDados(String idMatricula){
        IdSusep idSusep = new IdSusep();
        idSusep.setCodidgoProduto(700);
        idSusep.setNomeProduto("Prev VGBL");
        idSusep.setCodigoEnquadramentoFip(7);
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(String.valueOf(UUID.randomUUID()));
        pessoa.setSituacao("ATIVO");
        Matricula matricula = new Matricula();
        matricula.setId(String.valueOf(idMatricula));
        LocalDate localDate = LocalDate.of(2023, 5, 27);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        matricula.setData_criacao(date);
        matricula.setSituacao("COM SOLICITACAO RESGATE");
        matricula.setTipoTributacao("Regressiva");
        matricula.setIdSusep(idSusep);
        matricula.setPessoas(pessoa);
        Saldo saldo = new Saldo();
        saldo.setValorTotal(BigDecimal.valueOf(10000));
        saldo.setValorBloqueado(BigDecimal.valueOf(1000));
        Fundo fundo = new Fundo();
        fundo.setIdFundo(String.valueOf(UUID.randomUUID()));
        fundo.setCodigoFundo("FY45123");
        fundo.setDiaEfetivacao(3);
        fundo.setDiaCota(2);
        RegraCarencia regraCarencia = new RegraCarencia();
        regraCarencia.setQuantidadeDemaisCarencia(60);
        regraCarencia.setQuantidadePrimeiraCarencia(60);
        RegraTipoSaida regraTipoSaida = new RegraTipoSaida();
        regraTipoSaida.setPermiteSaidaParcial(true);
        regraTipoSaida.setPermiteSaidaTotal(true);
        Saida saida = new Saida(matricula, "RESGATE");
        saida.setFundo(fundo);
        saida.setSaldo(saldo);
        saida.setRegraTipoSaida(regraTipoSaida);
        saida.setRegraCarencia(regraCarencia);
        return saida;
    }
}
