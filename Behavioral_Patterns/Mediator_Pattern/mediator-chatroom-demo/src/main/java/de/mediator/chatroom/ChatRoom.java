package de.mediator.chatroom;

import java.util.Date;
import java.util.logging.Logger;

public class ChatRoom {
    private static final Logger LOGGER = Logger.getLogger("ChatRoom");

    private ChatRoom(){
        
    }
    
    public static void showMessage(User user, String message) {
        LOGGER.fine(new Date().toString() + " [" + user.getName() + "] : "
                + message);
    }
}