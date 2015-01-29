package de.state.state;

import java.util.logging.Logger;

public class StateApp {
    private static final Logger LOGGER = Logger.getLogger("StateApp");

    private StateApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting StateApp!");

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        LOGGER.fine(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        LOGGER.fine(context.getState().toString());

    }
}
