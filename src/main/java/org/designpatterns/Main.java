package org.designpatterns;

import org.designpatterns.Adaptor.VoltAdaptor;
import org.designpatterns.Adaptor.VoltAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VoltAdaptor obj=new VoltAdaptorImpl();
        System.out.println(obj.get3Volt());
        System.out.println(obj.get12Volt());
        System.out.println(obj.get120Volt());
    }
}