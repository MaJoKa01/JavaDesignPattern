package de.adapter.volt;

public class Socket {

    private static final int VOLT =120;
    
    public Volt getVolt() {
        return new Volt(VOLT);
    }
}
