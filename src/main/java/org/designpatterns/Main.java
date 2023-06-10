package org.designpatterns;

import org.designpatterns.Observer.Channel;
import org.designpatterns.Observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Channel sidemen=new Channel();
        Subscriber sub1=new Subscriber("tarun");
        Subscriber sub2=new Subscriber("elon");
        Subscriber sub3=new Subscriber("steve");
        Subscriber sub4=new Subscriber("tim");

        sidemen.subscribe(sub1);sidemen.subscribe(sub2);sidemen.subscribe(sub3);sidemen.subscribe(sub4);
        sub1.subscribeChannel(sidemen);sub2.subscribeChannel(sidemen);sub3.subscribeChannel(sidemen);sub4.subscribeChannel(sidemen);

        sidemen.upload("Observer design pattern");

        sidemen.unSubscribe(sub2);

        sidemen.upload("Strategy design pattern");
    }
}