package de.mediator.chatroom;

import java.util.logging.Logger;

public class ChatroomApp {
    private static final Logger LOGGER = Logger.getLogger("ChatroomApp");

    private ChatroomApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting ChatroomApp!");
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
