package de.state.state;

import java.util.logging.Logger;

public class StartState implements IState {
    private static final Logger LOGGER = Logger.getLogger("StartState");

    public void doAction(Context context) {
        LOGGER.fine("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
