package com.example;

public class Funciones {
    public static void main (String[] args) {
        int precio = 500;
        double precioConIVA = devolverPrecioConIVA(precio);

        System.out.println(precioConIVA);
    }

    private static double devolverPrecioConIVA (double precio) {
        return precio + precio * .07;
    }
}
