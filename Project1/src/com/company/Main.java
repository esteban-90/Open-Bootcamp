package com.company;

public class Main {
    public static void main (String[] args) {
        int resultado = suma(1, 2, 3);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarNroPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma (int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }
}
