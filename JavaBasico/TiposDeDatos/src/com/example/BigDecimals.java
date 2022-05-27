package com.example;

import java.math.BigDecimal;

public class BigDecimals {
    public static void main (String[] args) {
        // System.out.println(0.1f * 10);
        // System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);

        BigDecimal valA = new BigDecimal(3.14);
        BigDecimal valB = new BigDecimal(3.15);
        BigDecimal result = valA.add(valB);

        // for (int i = 1; i <= 10; i++)

        System.out.println(result.toString());
    }
}
