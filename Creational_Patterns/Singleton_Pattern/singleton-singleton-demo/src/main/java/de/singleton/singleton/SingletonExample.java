package de.singleton.singleton;

import java.util.logging.Logger;

public class SingletonExample {

    private static SingletonExample singletonExample = null;
    private static final Logger LOGGER = Logger.getLogger("SingletonExample");

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void sayHello() {
        LOGGER.fine("Hello");
    }
}
