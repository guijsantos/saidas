
package com.seuprojeto.saida.api;

import com.seuprojeto.saida.api.dto.ValidacaoRequest;
import com.seuprojeto.saida.api.dto.ValidacaoResponse;
import com.seuprojeto.saida.application.ValidacaoSaidaService;
import com.seuprojeto.saida.domain.model.Saida;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/saidas")
public class SaidaController {

    private final ValidacaoSaidaService service;

    public SaidaController(ValidacaoSaidaService service)
    {
        this.service = service;
    }

    @PostMapping("/validar")
    public ValidacaoResponse validar(@RequestBody ValidacaoRequest request) {

        Saida saida = service.validar(request);
        return new ValidacaoResponse(saida);
    }
}
