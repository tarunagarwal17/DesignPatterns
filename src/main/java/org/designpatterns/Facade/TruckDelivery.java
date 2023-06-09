package org.designpatterns.Facade;

public class TruckDelivery implements PackageDelivery{

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "TruckDelivery";
    }
}
