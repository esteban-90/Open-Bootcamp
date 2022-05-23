package POO.classes;

public abstract class Vehicle {
    // 1. Attributes
    protected String producer;
    protected String model;
    protected int year;
    protected boolean isSport;
    protected int speed;
    protected Engine engine;

    // 2. Constructors
    public Vehicle ( ) {
    }

    public Vehicle (String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Vehicle (String producer, String model, int year, boolean isSport, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.isSport = isSport;
        this.speed = 0;
        this.engine = engine;
    }

    // 3. Methods (behavior)
    public void accelerate (int quantity) {
        if (quantity <= 0) return;
        this.speed += quantity;
    }

    // 4. Getters, setters
    public String getProducer ( ) {
        return producer;
    }

    public void setProducer (String producer) {
        this.producer = producer;
    }

    public String getModel ( ) {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public int getYear ( ) {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public boolean isSport ( ) {
        return isSport;
    }

    public void setSport (boolean isSport) {
        this.isSport = isSport;
    }

    public int getSpeed ( ) {
        return speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }

    public Engine getEngine ( ) {
        return engine;
    }

    public void setEngine (Engine engine) {
        this.engine = engine;
    }
}
