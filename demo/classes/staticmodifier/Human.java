package demo.classes.staticmodifier;

import java.util.ArrayList;

public class Human {
    public String firstName;
    public String lastName;
    public static ArrayList<Human> humans = new ArrayList<>();

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        Human.humans.add(this);
    }
}
