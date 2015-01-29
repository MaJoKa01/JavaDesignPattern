package de.bridge.tv;

public abstract class RemoteControl {
    private TV implementor;

    public RemoteControl(TV impl) {
        implementor = impl;
    }

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }
}
