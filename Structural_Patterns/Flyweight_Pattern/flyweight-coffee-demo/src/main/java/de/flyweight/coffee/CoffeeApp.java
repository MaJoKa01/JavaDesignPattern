package de.flyweight.coffee;

import java.util.logging.*;

public class CoffeeApp {
   
    private static final Logger LOGGER = Logger.getLogger("CoffeeApp"); 
    private static final String CAPPUCCINO= "Cappuccino";
    private static final String REGULAR_COFFEE = "Regular Coffee";
    private static final int TABLE1= 1;
    private static final int TABLE2 =2;
    private static final int TABLE3 =3;
    private static final int TABLE4 =4;
    private static final int TABLE5 = 5;
    private static final int MAX_TABLE =20;
    private static final int MAX_CONTEXT =20;
    
    private static Coffee[] coffees = new Coffee[MAX_TABLE];
    // table array
    private static CoffeeContext[] tables = new CoffeeContext[MAX_CONTEXT];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;
    
    private CoffeeApp(){
        
    }
    
    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }

    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder(CAPPUCCINO, TABLE2);
        takeOrder(CAPPUCCINO, TABLE2);
        takeOrder(REGULAR_COFFEE , TABLE1);
        takeOrder(REGULAR_COFFEE , TABLE2);
        takeOrder(REGULAR_COFFEE , TABLE3);
        takeOrder(REGULAR_COFFEE , TABLE4);
        takeOrder(CAPPUCCINO, TABLE4);
        takeOrder(CAPPUCCINO, TABLE5);
        takeOrder(REGULAR_COFFEE , TABLE3);
        takeOrder(CAPPUCCINO, TABLE3);

        for (int i = 0; i < ordersCount; ++i) {
            coffees[i].serveCoffee(tables[i]);
        }

        LOGGER.fine("\nTotal Coffee objects made: "
                + coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}
