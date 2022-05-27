package com.example;

import java.util.LinkedList;

public class LinkedLists {
    public static void main (String[] args) {
        LinkedList<String> list = new LinkedList<String>(); // Más rápida para modificar

        list.add("Elemento0");
        list.add("Elemento1");
        list.add("Elemento2");

        System.out.println(list);
    }
}
