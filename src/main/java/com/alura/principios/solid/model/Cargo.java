package com.alura.principios.solid.model;

/**
 * @author Adriano Rabello
 * @created 07 / 01 / 2021 - 11:06
 */
public enum Cargo {

    ASSISTENTE {

        @Override
        public Cargo getProximoCargo(){

            return ANALISTA;
        }
    },
    ANALISTA{

        @Override
        public Cargo getProximoCargo(){

            return ESPECIALISTA;
        }
    },
    ESPECIALISTA{

        @Override
        public Cargo getProximoCargo(){

            return GERENTE;
        }
    },
    GERENTE{

        @Override
        public Cargo getProximoCargo(){

            return GERENTE;
        }
    };


    /** make ENUM implements next and set Cargo */
    public abstract Cargo getProximoCargo();
}
