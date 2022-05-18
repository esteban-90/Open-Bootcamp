public class Main {
    public static void main (String[] args) {
        Coche coche = new Coche();
        ejecutar(coche);

        Moto moto = new Moto();
        ejecutar(moto);

        var valA = 5;
        var valB = 10;
        int resultado = suma(valA, valB);

        System.out.println(resultado);
        System.out.println(valA);
        System.out.println(valB);

        var factorial5 = factorial(5);
        System.out.println("factorial5 " + factorial5);

        sumaRecursiva(5,7);
    }

    public static void ejecutar (Vehiculo vehiculo) {
        vehiculo.acelerar(15);
        vehiculo.frenar(14);
    }

    public static int suma (int a, int b) {
        return a + b;
    }

    public static int factorial (int número) {
        return número == 1
                ? número
                : número * factorial(número - 1);
    }

    public static void sumaRecursiva (int a, int b) {
        var temp = a + b;
        System.out.println("a: " + a + "\nb: " + b + "\ntemp: " + temp);
        if (b >= 90) return;
        sumaRecursiva(a, temp);
    }
}

interface Vehiculo {
    void acelerar (int velocidad);

    void frenar (int velocidad);
}

class Coche implements Vehiculo {
    public void acelerar (int velocidad) {
        System.out.println("Acelerando coche " + velocidad);
    }

    public void frenar (int velocidad) {
        System.out.println("Frenando coche " + velocidad);
    }
}

class Moto implements Vehiculo {
    public void acelerar (int velocidad) {
        System.out.println("Acelerando moto " + velocidad);
    }

    public void frenar (int velocidad) {
        System.out.println("Frenando moto " + velocidad);
    }
}
