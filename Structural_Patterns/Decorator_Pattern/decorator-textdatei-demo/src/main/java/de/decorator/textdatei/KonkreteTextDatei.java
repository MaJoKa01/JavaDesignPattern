package de.decorator.textdatei;

import java.util.logging.Logger;

public class KonkreteTextDatei extends TextDatei {

    private static final Logger LOGGER = Logger.getLogger("KonkreteTextDatei");

    public String speichern(String dateiname) {

        LOGGER.fine("Datei speichern");
        return dateiname;
    }
}
