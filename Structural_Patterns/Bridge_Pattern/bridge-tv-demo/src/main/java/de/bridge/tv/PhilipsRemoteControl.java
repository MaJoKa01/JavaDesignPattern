package de.bridge.tv;

public class PhilipsRemoteControl extends RemoteControl {
    private int currentChannel = 0;
    private static final int INCREMENT_CHANNEL= 2;
    private static final int DECREMENT_CHANNEL= 2;

    public PhilipsRemoteControl(TV impl) {
        super(impl);
    }

    public void nextChannel() {
        currentChannel = currentChannel + INCREMENT_CHANNEL;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel = currentChannel - DECREMENT_CHANNEL;
        setChannel(currentChannel);
    }
}
