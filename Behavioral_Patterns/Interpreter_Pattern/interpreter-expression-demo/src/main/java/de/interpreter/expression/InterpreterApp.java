package de.interpreter.expression;

import java.util.logging.Logger;

public class InterpreterApp {
    private static final Logger LOGGER = Logger.getLogger("InterpreterApp");

    private InterpreterApp() {

    }

    // Rule: Robert and John are male
    public static IExpression getMaleExpression() {
        IExpression robert = new TerminalExpression("Robert");
        IExpression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    // Rule: Julie is a married women
    public static IExpression getMarriedWomanExpression() {
        IExpression julie = new TerminalExpression("Julie");
        IExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        LOGGER.fine("Starting InterpreterApp!");

        IExpression isMale = getMaleExpression();
        IExpression isMarriedWoman = getMarriedWomanExpression();

        LOGGER.fine("John is male? " + isMale.interpret("John"));
        LOGGER.fine("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }

}
