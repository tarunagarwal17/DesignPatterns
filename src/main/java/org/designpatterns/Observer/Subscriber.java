package org.designpatterns.Observer;

public class Subscriber implements Observer {
    private final String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        super();
        this.name = name;
    }

    @Override
    public void upload() {
        System.out.println("Hi " + name + ", Video uploaded: " + channel.title);
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }

}
