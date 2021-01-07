package com.alura.principios.solid.promocao;

import com.alura.principios.solid.ValidacaoException;
import com.alura.principios.solid.model.Cargo;
import com.alura.principios.solid.model.Funcionario;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:49
 */
public class PromocaoService {


    public void promover(Funcionario funcionario, boolean metaBatida){

        Cargo cargoAtual = funcionario.getCargo();

        if(cargoAtual == Cargo.GERENTE){
            throw new ValidacaoException("Gerentes não podem ser promovidos ");
        }

        if(metaBatida){

            Cargo proximoCargo = cargoAtual.getProximoCargo(); // return the next Cargo inside Enum
            funcionario.setCargo(proximoCargo);
        }else{

            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }
}
