package org.designpatterns.Adaptor;

public class VoltAdaptorImpl implements VoltAdaptor{

    Socket socket=new Socket();
    int volt=socket.getVoltage().getVolt();


    @Override
    public int get3Volt() {
        return convert(volt,40);
    }

    @Override
    public int get12Volt() {
        return convert(volt,10);
    }

    @Override
    public int get120Volt() {
        return volt;
    }

    private int convert(int volt,int conversion){
        return volt/conversion;
    }

}
