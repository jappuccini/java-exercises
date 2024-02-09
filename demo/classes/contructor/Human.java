package demo.classes.contructor;

public class Human {

    public String firstName;
    public String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String fullName) {
        String[] names = fullName.split(";");
        this.firstName = names[0];
        this.lastName = names[1];
    }


}
