package com.example;

public class Bucles {
    public static void main (String[] args) {
        String[] nombres = {"Alberto", "Helena", "Ana", "Carlos", "Héctor", "Alicia"};
        StringBuilder resultado = new StringBuilder();
        int cantidad = nombres.length;

        for (int i = 0; i < cantidad; i++) {
            resultado.append(nombres[i]);

            if (i == cantidad - 1) resultado.append(".");
            else if (i == cantidad - 2) resultado.append(" y ");
            else resultado.append(", ");
        }

        System.out.println(resultado);
    }
}
