package com.company;

public class Main {
    public static void main (String[] args) {
        var numeroIf = 1;

        if (numeroIf > 0) System.out.println("Es positivo");
        else if (numeroIf < 0) System.out.println("Es negativo");
        else System.out.println("Es 0");

        var numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        var numeroDoWhile = 1;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);

        for (var numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estación = "otoño";
        var mensaje = "La estación es ";

        switch (estación) {
            case "primavera":
                System.out.println(mensaje + estación);
                break;
            case "verano":
                System.out.println(mensaje + estación);
                break;
            case "otoño":
                System.out.println(mensaje + estación);
                break;
            case "invierno":
                System.out.println(mensaje + estación);
                break;
            default:
                System.out.println("No hay tal estación");
        }
    }
}
