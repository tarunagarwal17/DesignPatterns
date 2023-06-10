package org.designpatterns.Observer;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifySubscriber();

    void upload(String title);
}
