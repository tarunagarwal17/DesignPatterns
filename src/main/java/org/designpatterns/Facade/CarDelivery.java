package org.designpatterns.Facade;

public class CarDelivery implements PackageDelivery{

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "CarDelivery";
    }
}
