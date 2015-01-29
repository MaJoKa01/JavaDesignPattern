package de.decorator.textdatei;

import java.util.logging.Logger;

public class EntitiesUmgewandeltTextdateiDekorierer extends TextDateiDekorierer {

    private final TextDatei textdatei;
    private static final Logger LOGGER = Logger
            .getLogger("EntitiesUmgewandeltTextdateiDekorierer");

    public EntitiesUmgewandeltTextdateiDekorierer(TextDatei textdatei) {
        this.textdatei = textdatei;
    }

    public String speichern(String dateiname) {
        return umwandeln(textdatei.speichern(dateiname));
    }

    private String umwandeln(String dateiname) {
        LOGGER.fine("HTML-Entities in der Datei umgewandelt!");
        return dateiname;
    }
}
