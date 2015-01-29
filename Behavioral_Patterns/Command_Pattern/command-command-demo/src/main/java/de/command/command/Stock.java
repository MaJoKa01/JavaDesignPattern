package de.command.command;

import java.util.logging.Logger;

public class Stock {
    private static final String NAME = "ABC";
    private static final int QUANTITY = 10;
    private static final Logger LOGGER = Logger.getLogger("Stock");

    public void buy(){
       LOGGER.fine("Stock [ Name: "+NAME+", Quantity: " + QUANTITY +" ] bought");
    }
    public void sell(){
       LOGGER.fine("Stock [ Name: "+NAME+", Quantity: " + QUANTITY +" ] sold");
    }
}
