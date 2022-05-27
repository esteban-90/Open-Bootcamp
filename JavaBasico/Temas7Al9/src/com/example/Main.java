package com.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        // Función que devuelve una cadena al revés
        System.out.println("Función que devuelve una cadena al revés");
        System.out.println(reverse("hola mundo"));

        // 1.
        System.out.println("1.-----------------------");
        String[] brawlers = {"Colt", "Genio", "Bea", "Bull", "Shelly"};
        for (String brawler : brawlers) System.out.println(brawler);

        // 2.
        System.out.println("2.-----------------------");
        int[][] integers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                System.out.println("Posición: (" + i + "," + j + ")\nValor: " + integers[i][j]);
            }
        }

        // 3.
        System.out.println("3.-----------------------");
        Vector<String> vector = new Vector<>();

        for (int i = 1; i <= 5; i++) vector.add("Elemento" + i);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        // 4.
        System.out.println("4.-----------------------");
        Vector<Integer> vectorTest = new Vector<>(10);

        System.out.println("Tamaño del vector1: " + vectorTest.size());
        System.out.println("Capacidad del vector1: " + vectorTest.capacity());

        for (int i = 1; i <= 1000; i++) vectorTest.add(i);

        System.out.println("Tamaño del vector1: " + vectorTest.size());
        System.out.println("Capacidad del vector1: " + vectorTest.capacity());

        // 5.
        System.out.println("5.-----------------------");
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= 4; i++) arrayList.add("Elemento" + i);

        LinkedList<String> linkedList = new LinkedList<>();

        for (String arrayListItem : arrayList) {
            linkedList.add(arrayListItem);
            System.out.println(arrayListItem);
        }

        for (Object linkedListItem : linkedList.toArray()) {
            System.out.println(linkedListItem.toString());
        }

        // 6.
        System.out.println("6.-----------------------");
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (int i = 1; i <= 10; i++) arrayListInt.add(i);

        for (int i = 0; i < arrayListInt.size(); i++) {
            if (i % 2 == 0) {
                arrayListInt.remove(i);
                continue;
            }
            System.out.println(arrayListInt.get(i));
        }

        // 7.
        System.out.println("7.-----------------------");
        try {
            int resultado = dividePorCero(5);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        // 8.
        System.out.println("8.-----------------------");
        boolean ok = false;

        do {
            System.out.print("Ingresa dos ficheros:");
            Scanner scanner = new Scanner(System.in);
            scanner.reset();

            try {
                String a = scanner.next();
                String b = scanner.next();

                copiarFichero(a, b);

                ok = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (! ok);

        // 9.
        System.out.println("9.-----------------------");
        System.out.println("Ingresa tus contactos");

        HashMap<String, Integer> phonebookMap = new HashMap<>();
        String phonebookPath = "JavaBasico/Temas7Al9/src/com/example/phonebook.txt";
        int total = 1;

        do {
            Scanner scanner = new Scanner(System.in);
            scanner.reset();

            try {
                InputStream phoneBookFileIn = new FileInputStream(phonebookPath);
                byte[] contacts = phoneBookFileIn.readAllBytes();
                phoneBookFileIn.close();

                PrintStream phoneBookFileOut = new PrintStream(phonebookPath);
                phoneBookFileOut.write(contacts);

                String name = scanner.next();
                int number = scanner.nextInt();

                phonebookMap.put(name, number);

                phoneBookFileOut.print(name + ": " + number + '\n');
                phoneBookFileOut.close();

                total++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (total <= 3);

        for (Map.Entry<String, Integer> phonebookEntry : phonebookMap.entrySet()) {
            System.out.println("Clave: " + phonebookEntry.getKey());
            System.out.println("Valor: " + phonebookEntry.getValue());
        }
    }

    public static String reverse (String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) resultado.append(texto.charAt(i));

        return resultado.toString();
    }

    public static int dividePorCero (int numero) throws ArithmeticException {
        return numero / 0;
    }

    public static void copiarFichero (String fileIn, String fileOut) {
        String path = "JavaBasico/Temas7Al9/src/com/example/";
        String extension = ".txt";

        try {
            InputStream in = new FileInputStream(path + fileIn + extension);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(path + fileOut + extension);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

