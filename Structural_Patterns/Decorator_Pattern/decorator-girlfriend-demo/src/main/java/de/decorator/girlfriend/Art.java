package de.decorator.girlfriend;

public class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl g) {
        girl = g;
    }

    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

}