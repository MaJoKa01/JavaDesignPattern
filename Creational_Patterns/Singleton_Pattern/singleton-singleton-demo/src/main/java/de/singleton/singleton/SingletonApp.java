package de.singleton.singleton;

import java.util.logging.Logger;

public class SingletonApp {
    private static final Logger LOGGER = Logger.getLogger("SingletonApp");

    private SingletonApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Start singleton pattern");
        SingletonExample singletonExample = SingletonExample.getInstance();

        singletonExample.sayHello();

    }
}
