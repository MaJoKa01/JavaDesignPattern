package de.decorator.email;

public class SecureEmailDecorator extends EmailDecorator {

    private String content;

    public SecureEmailDecorator(IEmail basicEmail) {
        originalEmail = basicEmail;
    }

    public String getContents() {
        // secure original
        content = encrypt(originalEmail.getContents());
        return content;
    }

    private String encrypt(String message) {

        // append company disclaimer to message
        return message + "\n encrypted email";
    }
}
