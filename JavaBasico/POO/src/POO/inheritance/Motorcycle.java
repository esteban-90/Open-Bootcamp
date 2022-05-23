package POO.inheritance;

import POO.classes.Vehicle;

public class Motorcycle extends Vehicle {
    private boolean hasTrunk;

    public Motorcycle ( ) {
    }

    public Motorcycle (String producer, String model, boolean hasTrunk) {
        super(producer, model);
        this.hasTrunk = hasTrunk;
    }

    public boolean getHasTrunk ( ) {
        return hasTrunk;
    }

    public void setHasTrunk (boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }
}
