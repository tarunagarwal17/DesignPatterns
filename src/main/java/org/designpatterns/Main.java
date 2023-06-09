package org.designpatterns;

import org.designpatterns.Adaptor.VoltAdaptor;
import org.designpatterns.Adaptor.VoltAdaptorImpl;
import org.designpatterns.Decorator.BasicCar;
import org.designpatterns.Decorator.Car;
import org.designpatterns.Decorator.LuxuryCar;
import org.designpatterns.Decorator.SportsCar;
import org.designpatterns.Facade.DeliveryManager;
import org.designpatterns.Facade.PackageInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car sportsCar=new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar=new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        Car sportsLuxuryCar=new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();


    }
}