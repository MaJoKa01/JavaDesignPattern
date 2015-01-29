package de.decorator.email;

public class Email implements IEmail {

    private String content;

    public Email(String content) {

        this.content = content;
    }

    public String getContents() {
        // general email stuff
        return content;
    }
}
