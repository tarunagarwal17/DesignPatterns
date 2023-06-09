package org.designpatterns.Facade;

public class DeliveryManager {
    public String factory(PackageInfo packageInfo){
        if(packageInfo.getSize().equalsIgnoreCase("small"))
            return new BicycleDelivery().deliveryWay(packageInfo);
        else if(packageInfo.getSize().equalsIgnoreCase("medium"))
            return new CarDelivery().deliveryWay(packageInfo);
        else if(packageInfo.getSize().equalsIgnoreCase("large"))
            return new TruckDelivery().deliveryWay(packageInfo);
        return "Failed delivery";
    }
}
