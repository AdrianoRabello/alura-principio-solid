package com.alura.principios.solid.service;

import com.alura.principios.solid.model.Funcionario;

import java.math.BigDecimal;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:28
 */
public interface ValidacaoReajuste {

    void valida(Funcionario funcionario, BigDecimal aumento);
}
