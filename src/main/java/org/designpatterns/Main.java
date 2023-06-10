package org.designpatterns;

import org.designpatterns.Observer.Channel;
import org.designpatterns.Observer.Subscriber;
import org.designpatterns.Stratergy.Addition;
import org.designpatterns.Stratergy.Context;
import org.designpatterns.Stratergy.Multiplication;
import org.designpatterns.Stratergy.Subtraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Context context=new Context(new Addition());
        System.out.println(context.executeStrategy(10,5));

        Context context2=new Context(new Subtraction());
        System.out.println(context2.executeStrategy(10,5));

        Context context3=new Context(new Multiplication());
        System.out.println(context3.executeStrategy(10,5));
    }
}