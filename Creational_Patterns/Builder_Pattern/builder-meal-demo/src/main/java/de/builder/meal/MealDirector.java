package de.builder.meal;

public class MealDirector {

    private IMealBuilder mealBuilder = null;

    public MealDirector(IMealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

}
