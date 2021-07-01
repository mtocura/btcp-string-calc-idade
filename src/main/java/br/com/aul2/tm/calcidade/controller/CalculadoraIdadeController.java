package br.com.aul2.tm.calcidade.controller;

import br.com.aul2.tm.calcidade.utils.CalculadoraIdade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula2/tm")
public class CalculadoraIdadeController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer idade(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) {
        return CalculadoraIdade.calculaIdade(dia, mes, ano);
    }
}
