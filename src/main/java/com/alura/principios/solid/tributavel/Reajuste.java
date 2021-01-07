package com.alura.principios.solid.tributavel;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @autor Adriano Rabello 07/01/2021 - 7:33 PM
 */
public interface Reajuste {

    BigDecimal valor();
    LocalDate data();
}
