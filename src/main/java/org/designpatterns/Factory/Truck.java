package org.designpatterns.Factory;

public class Truck implements Vehicle{

    private String engine;
    private String color;
    private String milage;

    public Truck(String engine, String color, String milage) {
        this.engine = engine;
        this.color = color;
        this.milage = milage;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMilage() {
        return milage;
    }
}
