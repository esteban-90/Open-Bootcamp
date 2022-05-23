package POO.inheritance;

import POO.classes.Engine;
import POO.classes.Vehicle;

public class Car extends Vehicle {
    private int doors;

    public Car ( ) {
    }

    public Car (String producer, String model, int year, boolean isSport, Engine engine, int doors) {
        super(producer, model, year, isSport, engine);
        this.doors = doors;
    }

    public int getDoors ( ) {
        return doors;
    }

    public void setDoors (int doors) {
        this.doors = doors;
    }
}
