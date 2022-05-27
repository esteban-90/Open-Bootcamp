package com.example;

import java.util.Vector;

public class Vectors {
    public static void main (String[] args) {
        Vector<Integer> vector1 = new Vector<>(50, 15);

        // Añadir datos
        for (int i = 1; i <= 11; i++) vector1.add(i);

        // Leer datos
        for (int i : vector1) System.out.println("Dato actual en vector1: " + i);

        System.out.println("Datos del vector1: " + vector1);

        vector1.remove(1);

        System.out.println("Tamaño del vector1: " + vector1.size());
        System.out.println("Capacidad del vector1: " + vector1.capacity());

        vector1.trimToSize();

        System.out.println("Capacidad del vector1: " + vector1.capacity());

        System.out.println('\n');

        Vector<Integer> vector2 = new Vector<>();

        // Añadir datos
        for (int i = 1; i <= 11; i++) vector2.add(i);

        // Leer datos
        for (int i = 0; i < vector2.size(); i++) {
            if (i % 2 == 0) {
                // vector2.remove(i);
                continue;
            }

            System.out.println("Dato actual en vector2: " + vector2.get(i));
        }

        boolean result = vector1.equals(vector2);

        System.out.println("¿Son iguales? " + (result ? "sí" : "no"));
    }
}
