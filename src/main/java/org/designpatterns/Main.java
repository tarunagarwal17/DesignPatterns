package org.designpatterns;

import org.designpatterns.Builder.Car;
import org.designpatterns.Factory.VehicleFactory;
import org.designpatterns.Singleton.SingleObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var obj1=VehicleFactory.getVehicle("car","car","blue","20");
        var obj2=VehicleFactory.getVehicle("truck","truck","black","10");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}