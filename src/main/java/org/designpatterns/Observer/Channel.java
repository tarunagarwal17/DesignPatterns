package org.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Subscriber> subscriberList=new ArrayList<>();
    String title;

    @Override
    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(){
        for(Subscriber sub: subscriberList){
            sub.upload();
        }
    }

    @Override
    public  void upload(String title){
        this.title=title;
        notifySubscriber();
    }

}
