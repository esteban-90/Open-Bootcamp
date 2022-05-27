package com.example;

import java.util.ArrayList;

public class ArrayLists {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Más rápida para almacenar y buscar

        list.add("ElementoA");
        list.add("ElementoB");
        list.add("ElementoC");
        list.add("ElementoD");
        list.add("ElementoE");

        System.out.println("Contenido: " + list + '\n');

        list.remove("ElementoB");
        list.remove(2);

        System.out.println("Contenido: " + list + '\n');

        // Concurrente: Vector
        // Secuencial: ArrayList

        for (String item : list) System.out.println(item);

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));

        String[] array = new String[list.size()];

        for (int i = 0; i < list.size(); i++) array[i] = list.get(i);

        for (String element : array) System.out.println(element);

        for (Object element : list.toArray()) System.out.println(element.toString());
    }
}
