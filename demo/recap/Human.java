package demo.recap;

public class Human implements Item {
    public final String firstName;
    public final String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getDescription() {
        return this.getName();
    }
}
