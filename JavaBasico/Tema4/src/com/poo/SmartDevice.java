package com.poo;

import java.util.StringJoiner;

public abstract class SmartDevice {
    protected String brand;
    protected String model;
    protected String screen;
    protected String processor;
    protected String ram;
    protected String storage;
    protected String battery;
    protected String operatingSystem;
    protected boolean hasMemoryExpansion;

    public SmartDevice ( ) {
    }

    public SmartDevice (
            String brand,
            String model,
            String screen,
            String processor,
            String ram,
            String storage,
            String battery,
            String operatingSystem,
            boolean hasMemoryExpansion) {

        this.brand = brand;
        this.model = model;
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        this.hasMemoryExpansion = hasMemoryExpansion;
    }

    @Override
    public String toString ( ) {
        return "{" + '\n' +
                "\tBrand: " + brand + '\n' +
                "\tModel: " + model + '\n' +
                "\tScreen: " + screen + '\n' +
                "\tProcessor: " + processor + '\n' +
                "\tRAM: " + ram + '\n' +
                "\tStorage: " + storage + '\n' +
                "\tBattery: " + battery + '\n' +
                "\tOperating System: " + operatingSystem + '\n' +
                "\tHas Memory Expansion: " + (hasMemoryExpansion ? "yes" : "no") + '\n';
    }
}
