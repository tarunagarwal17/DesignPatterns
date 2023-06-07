package org.designpatterns;

import org.designpatterns.Builder.Car;
import org.designpatterns.Singleton.SingleObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car obj=new Car.CarBuilder().setColor("Orange").setCompany("Buggati").setCost(10000).build();
        System.out.println(obj.toString());
    }
}