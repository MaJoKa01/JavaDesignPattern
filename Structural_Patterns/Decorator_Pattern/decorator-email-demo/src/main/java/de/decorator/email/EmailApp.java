package de.decorator.email;

import java.util.logging.Logger;

public class EmailApp {
    private static final Logger LOGGER = Logger.getLogger("EmailApp");

    private EmailApp() {

    }

    public static void sendEmail(IEmail mail) {
        LOGGER.fine(mail.getContents());
    }

    public static void main(String[] args) {

        Email newEmail = new Email("Simple Mail");
        SecureEmailDecorator newDecorator = new SecureEmailDecorator(newEmail);
        sendEmail(newDecorator);
    }
}
