package com.alura.principios.solid.tributavel;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @autor Adriano Rabello 07/01/2021 - 7:33 PM
 */
public class Promocao  implements ReajusteTributavel{
    @Override
    public BigDecimal valorImpostoRenda() {
        return null;
    }

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }
}
