package de.state.state;

import java.util.logging.Logger;

public class StopState implements IState {

    private static final Logger LOGGER = Logger.getLogger("StopState");

    public void doAction(Context context) {
        LOGGER.fine("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
