
package com.seuprojeto.saida.domain.regra;

import com.seuprojeto.saida.domain.model.Saida;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("ValidarSaldo")
public class ValidarSaldo implements RegraValidacao {
    @Override
    public void aplicar(Saida saida) {
        BigDecimal valorDisponivel =
                saida.getSaldo().getValorTotal()
                .subtract(saida.getSaldo().getValorBloqueado());
        saida.getSaldo().setValorDisponivel(valorDisponivel);

    }
}
