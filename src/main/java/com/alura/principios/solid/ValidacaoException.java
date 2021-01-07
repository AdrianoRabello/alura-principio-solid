package com.alura.principios.solid;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:06
 */
public class ValidacaoException extends  RuntimeException{

     private static final long serialVersionUID = 1L;

     public ValidacaoException(String mensagem){

          super(mensagem);
     }
}
