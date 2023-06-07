package org.designpatterns;

import org.designpatterns.Singleton.SingleObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingleObject obj1=SingleObject.getSingleObject();
        SingleObject obj2=SingleObject.getSingleObject();
        SingleObject obj3=SingleObject.getSingleObject();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}