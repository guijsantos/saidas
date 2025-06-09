
package com.seuprojeto.saida.domain.regra;

import com.seuprojeto.saida.domain.model.Saida;

public interface RegraValidacao {
    void aplicar(Saida saida);
}
