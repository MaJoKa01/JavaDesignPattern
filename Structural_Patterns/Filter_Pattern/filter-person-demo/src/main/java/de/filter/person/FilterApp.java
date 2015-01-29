package de.filter.person;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

public class FilterApp {

    private static final Logger LOGGER = Logger.getLogger("FilterApp");
    private static final String MALE = "Male";
    private static final String FEMALE = "Female";
    private static final String MARRIED = "Married";
    private static final String SINGLE = "Single";

    private static final String ROBERT = "Robert";
    private static final String JOHN = "John";
    private static final String LAURA = "Laura";
    private static final String DIANA = "Diana";
    private static final String MIKE = "Mike";
    private static final String BOBBY = "Bobby";

    private FilterApp() {

    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person(ROBERT, MALE, SINGLE));
        persons.add(new Person(JOHN, MALE, MARRIED));
        persons.add(new Person(LAURA, FEMALE, MARRIED));
        persons.add(new Person(DIANA, FEMALE, SINGLE));
        persons.add(new Person(MIKE, MALE, SINGLE));
        persons.add(new Person(BOBBY, MALE, SINGLE));

        ICriteria male = new CriteriaMale();
        ICriteria female = new CriteriaFemale();
        ICriteria single = new CriteriaSingle();
        ICriteria singleMale = new AndCriteria(single, male);
        ICriteria singleOrFemale = new OrCriteria(single, female);

        LOGGER.fine("\n " + MALE + "s: ");
        printPersons(male.meetCriteria(persons));

        LOGGER.fine("\n " + FEMALE + "s: ");
        printPersons(female.meetCriteria(persons));

        LOGGER.fine("\n " + SINGLE + " " + MALE + "s: ");
        printPersons(singleMale.meetCriteria(persons));

        LOGGER.fine("\n " + SINGLE + " Or  " + FEMALE + "s: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            LOGGER.fine("Person : [ Name : " + person.getName() + ", Gender : "
                    + person.getGender() + ", Marital Status : "
                    + person.getMaritalStatus() + " ]");
        }
    }
}
