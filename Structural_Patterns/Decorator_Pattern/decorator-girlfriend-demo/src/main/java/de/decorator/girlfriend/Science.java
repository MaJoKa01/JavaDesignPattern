package de.decorator.girlfriend;

public class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl g) {
        girl = g;
    }

    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

}
