
package com.seuprojeto.saida.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidacaoRequest {
    private String idMatricula;
    private String tipoSaida;

    public String getIdMatricula() { return idMatricula; }
    public void setIdMatricula(String idMatricula) { this.idMatricula = idMatricula; }
    public String getTipoSaida() { return tipoSaida; }
    public void setTipoSaida(String tipoSaida) { this.tipoSaida = tipoSaida; }

}
