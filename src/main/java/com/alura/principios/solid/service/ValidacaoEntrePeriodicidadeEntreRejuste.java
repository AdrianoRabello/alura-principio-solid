package com.alura.principios.solid.service;

import com.alura.principios.solid.ValidacaoException;
import com.alura.principios.solid.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:21
 */
public class ValidacaoEntrePeriodicidadeEntreRejuste implements ValidacaoReajuste {

    public void valida(Funcionario funcionario, BigDecimal aumento){

        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();

        LocalDate dataAtual = LocalDate.now();

        /** verifca se o tempo entre a data atual e o último reajuste é menor o que 6 meses */
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6 ){
            throw new ValidacaoException("Intervalo entre reajsute menor que 6 meses");
        }
    }
}
