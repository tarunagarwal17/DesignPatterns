package org.designpatterns;

import org.designpatterns.Adaptor.VoltAdaptor;
import org.designpatterns.Adaptor.VoltAdaptorImpl;
import org.designpatterns.Facade.DeliveryManager;
import org.designpatterns.Facade.PackageInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PackageInfo packageInfo=new PackageInfo("large","10");
        DeliveryManager deliveryManager=new DeliveryManager();
        System.out.println(deliveryManager.factory(packageInfo));
    }
}