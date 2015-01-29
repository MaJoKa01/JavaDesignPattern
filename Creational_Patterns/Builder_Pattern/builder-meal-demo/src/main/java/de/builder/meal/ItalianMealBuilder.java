package de.builder.meal;

public class ItalianMealBuilder implements IMealBuilder {

    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }

    public void buildDrink() {
        meal.setDrink("red wine");
    }

    public void buildMainCourse() {
        meal.setMainCourse("pizza");
    }

    public void buildSide() {
        meal.setSide("bread");
    }

    public Meal getMeal() {
        return meal;
    }

}
