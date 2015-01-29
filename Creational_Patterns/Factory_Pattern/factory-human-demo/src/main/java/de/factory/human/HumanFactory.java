package de.factory.human;

public class HumanFactory {

    private HumanFactory() {

    }

    public static IHuman createHuman(String m) {
        IHuman p = null;
        if (m == "boy") {
            p = new Boy();
        } else if (m == "girl") {
            p = new Girl();
        }

        return p;
    }
}
