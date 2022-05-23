package POO.classes;

import POO.inheritance.Car;
import POO.inheritance.Motorcycle;
import POO.inheritance.Truck;

public class Main {
    public static void main (String[] args) {
        // Vehicle toyotaPrius = new Vehicle();

        Engine gti = new Engine("GTI", 190, 500.5, 6);
        Vehicle fordMustang = new Car("Ford", "Mustang", 1970, true, gti, 4);
        fordMustang.accelerate(50);

        System.out.println(fordMustang.getModel());
        System.out.println(fordMustang.getProducer());
        System.out.println(fordMustang.getSpeed());

        // Herencia
        Motorcycle kawasakiNinja = new Motorcycle();
        kawasakiNinja.producer = "Kawasaki";

        // Polimorfismo
        Vehicle vehicle;

        vehicle = new Motorcycle();
        vehicle.accelerate(50);

        vehicle = new Car();
        vehicle.accelerate(30);

        vehicle = new Truck();
        vehicle.accelerate(10);
    }
}
