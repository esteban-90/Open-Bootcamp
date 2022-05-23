package com.poo;

public class SmartPhone extends SmartDevice {
    private String camera;

    public SmartPhone ( ) {
    }

    public SmartPhone (
            String brand,
            String model,
            String screen,
            String processor,
            String ram,
            String storage,
            String battery,
            String operatingSystem,
            boolean hasMemoryExpansion,
            String camera) {

        super(brand, model, screen, processor, ram, storage, battery, operatingSystem, hasMemoryExpansion);

        this.camera = camera;
    }

    @Override
    public String toString ( ) {
        return super.toString() +
                "\tCamera: " + camera + '\n' +
                "}";
    }
}
