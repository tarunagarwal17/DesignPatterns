package org.designpatterns.Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type, String engine, String color, String milage){
        if(type.equalsIgnoreCase("Car"))
            return new Car(engine,color,milage);
        else if(type.equalsIgnoreCase("Truck"))
            return new Truck(engine,color,milage);
        return null;
    }
}
