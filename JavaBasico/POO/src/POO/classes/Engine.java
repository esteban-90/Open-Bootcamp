package POO.classes;

public class Engine {
    // 1. Attributes
    private String model;
    private int hp;
    private double cc;
    private int cylinders;

    // 2. Constructors
    public Engine ( ) {
    }

    public Engine (String model, int hp, double cc, int cylinders) {
        this.model = model;
        this.hp = hp;
        this.cc = cc;
        this.cylinders = cylinders;
    }

    // 4. Getters, setters

    public String getModel ( ) {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public int getHp ( ) {
        return hp;
    }

    public void setHp (int hp) {
        this.hp = hp;
    }

    public double getCc ( ) {
        return cc;
    }

    public void setCc (double cc) {
        this.cc = cc;
    }

    public int getCylinders ( ) {
        return cylinders;
    }

    public void setCylinders (int cylinders) {
        this.cylinders = cylinders;
    }
}
