package de.command.command;

public class BuyStock implements IOrder {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
       this.abcStock = abcStock;
    }

    public void execute() {
       abcStock.buy();
    }
 }
