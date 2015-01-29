package de.factory.human;

public class HumanApp {

    private HumanApp() {

    }

    public static void main(String[] args) {
        IHuman human = HumanFactory.createHuman("boy");
        human.walk();
        human.talk();

    }
}
