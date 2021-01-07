package com.alura.principios.solid.service;

import com.alura.principios.solid.ValidacaoException;
import com.alura.principios.solid.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:21
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0){

            throw new ValidacaoException("Reajuste não pode ser maior que 40% do salario");

        }
    }
}
