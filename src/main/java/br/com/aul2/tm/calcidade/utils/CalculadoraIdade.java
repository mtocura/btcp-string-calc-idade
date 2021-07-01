package br.com.aul2.tm.calcidade.utils;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraIdade {
    public static Integer calculaIdade(Integer dia, Integer mes, Integer ano) {
        Period idade;

        try {
            LocalDate data = LocalDate.of(ano, mes, dia);
            idade = Period.between(data, LocalDate.now());

            return idade.getYears();
        } catch (Exception e) {
            return 0;
        }
    }
}
