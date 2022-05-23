package com.poo;

public class SmartWatch extends SmartDevice {
    private boolean has4G;

    public SmartWatch ( ) {
    }

    public SmartWatch (
            String brand,
            String model,
            String screen,
            String processor,
            String ram,
            String storage,
            String battery,
            String operatingSystem,
            boolean hasMemoryExpansion,
            boolean has4G) {

        super(brand, model, screen, processor, ram, storage, battery, operatingSystem, hasMemoryExpansion);

        this.has4G = has4G;
    }

    @Override
    public String toString ( ) {
        return super.toString() +
                "\tHas 4G: " + (has4G ? "yes" : "no") + '\n' +
                "}";
    }
}
