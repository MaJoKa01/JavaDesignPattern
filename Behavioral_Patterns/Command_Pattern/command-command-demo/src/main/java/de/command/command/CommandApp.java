package de.command.command;

import java.util.logging.Logger;

public class CommandApp {
    private static final Logger LOGGER = Logger.getLogger("CommandApp");

    private CommandApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting CommandApp!");
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
