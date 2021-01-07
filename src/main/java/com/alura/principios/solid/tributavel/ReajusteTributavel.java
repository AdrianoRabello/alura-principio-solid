package com.alura.principios.solid.tributavel;

import java.math.BigDecimal;

/**
 * @autor Adriano Rabello 07/01/2021 - 7:33 PM
 */


/** implementando desta maneira teremos que sobrescrever o método da interface Reajuste e Reajuste Tributável */
public interface ReajusteTributavel  extends Reajuste{

    BigDecimal valorImpostoRenda();
}
