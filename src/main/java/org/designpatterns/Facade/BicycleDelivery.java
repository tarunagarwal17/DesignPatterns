package org.designpatterns.Facade;

public class BicycleDelivery implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "BicycleDelivery";
    }
}
