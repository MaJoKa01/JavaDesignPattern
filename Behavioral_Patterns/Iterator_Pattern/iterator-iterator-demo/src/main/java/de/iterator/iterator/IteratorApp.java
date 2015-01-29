package de.iterator.iterator;

import java.util.logging.Logger;

public class IteratorApp {
    private static final Logger LOGGER = Logger.getLogger("IteratorApp");

    private IteratorApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting IteratorApp!");
        NameRepository namesRepository = new NameRepository();

        for (IIterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            LOGGER.fine("Name : " + name);
        }
    }
}
