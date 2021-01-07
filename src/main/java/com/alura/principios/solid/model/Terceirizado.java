package com.alura.principios.solid.model;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 12:39
 */
public class Terceirizado {

    private DadosPessoais dadosPessoais;


    public Terceirizado( ) {

    }


    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
