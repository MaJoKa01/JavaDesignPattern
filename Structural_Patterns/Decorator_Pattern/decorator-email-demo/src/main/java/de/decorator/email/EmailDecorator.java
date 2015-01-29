package de.decorator.email;

public abstract class EmailDecorator implements IEmail {
    IEmail originalEmail;
}
