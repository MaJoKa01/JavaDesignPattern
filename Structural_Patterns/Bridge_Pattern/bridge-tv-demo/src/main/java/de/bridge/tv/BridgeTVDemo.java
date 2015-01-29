package de.bridge.tv;

public class BridgeTVDemo {

    private BridgeTVDemo() {

    }

    public static void main(String[] args) {

        SonyRemoteControl sonyRemoteControl = new SonyRemoteControl(new Sony());
        PhilipsRemoteControl philipsRemoteControl = new PhilipsRemoteControl(
                new Philips());

        sonyRemoteControl.on();
        philipsRemoteControl.on();
        sonyRemoteControl.nextChannel();
        philipsRemoteControl.nextChannel();
        sonyRemoteControl.prevChannel();
        philipsRemoteControl.prevChannel();
        sonyRemoteControl.off();
        philipsRemoteControl.off();
    }
}
