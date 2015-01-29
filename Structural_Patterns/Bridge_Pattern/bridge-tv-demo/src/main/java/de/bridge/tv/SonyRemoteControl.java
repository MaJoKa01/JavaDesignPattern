package de.bridge.tv;

public class SonyRemoteControl extends RemoteControl {
    private int currentChannel = 0;

    public SonyRemoteControl(TV impl) {
        super(impl);
    }

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}
