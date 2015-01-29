package de.adapter.volt;

public class SocketClassAdapter extends Socket implements ISocketAdapter {

    private static final int DIVISOR40 = 40;
    private static final int DIVISOR10 =10;
    public Volt get120Volt() {
        return getVolt();
    }

    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, DIVISOR10);
    }

    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, DIVISOR40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }

}
