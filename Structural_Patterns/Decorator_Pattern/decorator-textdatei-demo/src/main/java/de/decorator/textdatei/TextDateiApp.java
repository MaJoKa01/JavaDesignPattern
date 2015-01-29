package de.decorator.textdatei;

public class TextDateiApp {

    private TextDateiApp() {

    }

    public static void main(String[] args) {
        TextDatei textdatei = new KonkreteTextDatei();
        textdatei = new EntitiesUmgewandeltTextdateiDekorierer(textdatei);
        textdatei = new KomprimierteTextdateiDekorierer(textdatei);
        textdatei.speichern("MeinDateiname.txt");
    }
}
