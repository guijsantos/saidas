
package com.seuprojeto.saida.domain.regra;

import com.seuprojeto.saida.domain.model.Saida;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

@Component("ValidarTipoSaida")
public class ValidarTipoSaida implements RegraValidacao {
    @Override
    public void aplicar(Saida saida) {
        if (saida.getSaldo().
                getValorBloqueado().
                compareTo(BigDecimal.ZERO) > 0){
            saida.getRegraTipoSaida().setPermiteSaidaTotal(false);
        }
    }
}
