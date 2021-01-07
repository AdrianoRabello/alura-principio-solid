package com.alura.principios.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:06
 */
public class Funcionario {

    private DadosPessoais dadosPessoais;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais.setNome(nome);
        this.dadosPessoais.setCpf(cpf);
        this.cargo = cargo;
        this.salario = salario;

    }

    public void atualizarSalario(BigDecimal novoSalario) {

        this.salario = this.salario.add(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promomver(Cargo novoCargo){

        this.cargo = novoCargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }
}
