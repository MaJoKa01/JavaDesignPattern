package de.builder.meal;

import java.util.logging.Logger;

public class MealApp {
    private static final Logger LOGGER = Logger.getLogger("MealApp");

    private MealApp() {

    }

    public static void main(String[] args) {
        IMealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        LOGGER.fine("meal is: " + meal);

        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        LOGGER.fine("meal is: " + meal);
    }
}
