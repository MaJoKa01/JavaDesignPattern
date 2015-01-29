package de.builder.meal;

public class JapaneseMealBuilder implements IMealBuilder {

    private Meal meal;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    public void buildDrink() {
        meal.setDrink("sake");
    }

    public void buildMainCourse() {
        meal.setMainCourse("chicken teriyaki");
    }

    public void buildSide() {
        meal.setSide("miso soup");
    }

    public Meal getMeal() {
        return meal;
    }

}
