package com.alura.principios.solid.service;

import com.alura.principios.solid.model.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:07
 */
public class ReajusteService {

    private List<ValidacaoReajuste> validacoes = new ArrayList<>();


    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){

        this.validacoes.forEach(v -> {
            v.valida(funcionario,aumento);
        });

        BigDecimal salarioRejustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioRejustado);

    }
}
