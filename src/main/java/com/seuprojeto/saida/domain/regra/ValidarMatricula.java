
package com.seuprojeto.saida.domain.regra;

import com.seuprojeto.saida.domain.model.Saida;
import org.springframework.stereotype.Component;

@Component("ValidarMatricula")
public class ValidarMatricula implements RegraValidacao {
    @Override
    public void aplicar(Saida saida) {
        if (!saida.getMatricula().getSituacao().equals("ATIVO")) {
            saida.adicionarErros("Matrícula inválida.");
        }
    }
}
