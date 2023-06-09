package org.designpatterns.Adaptor;

public class Socket {
    public Volt getVoltage(){
        return new Volt(120);
    }
}
