package com.example;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main (String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave4", 40);
        map.put("clave5", 50);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }

        /*@SuppressWarnings("rawtypes")
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }*/

        System.out.println(map.get("clave1"));

        map.replace("clave1", 15);

        System.out.println(map.get("clave1"));

        map.remove("clave2");
    }
}
