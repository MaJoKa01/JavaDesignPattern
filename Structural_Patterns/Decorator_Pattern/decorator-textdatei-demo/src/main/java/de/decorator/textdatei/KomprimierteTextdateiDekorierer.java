package de.decorator.textdatei;

import java.util.logging.Logger;

public class KomprimierteTextdateiDekorierer extends TextDateiDekorierer {

    private final TextDatei textdatei;
    private static final Logger LOGGER = Logger
            .getLogger("KomprimierteTextdateiDekorierer");

    public KomprimierteTextdateiDekorierer(TextDatei textdatei) {
        this.textdatei = textdatei;
    }

    public String speichern(String dateiname) {
        return komprimieren(textdatei.speichern(dateiname));
    }

    private String komprimieren(String dateiname) {
        LOGGER.fine("Datei komprimiert!");
        return dateiname;
    }
}
