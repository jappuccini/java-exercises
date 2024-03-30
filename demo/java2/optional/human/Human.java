package demo.java2.optional.human;

import java.util.Optional;

public class Human {
    public String firstName;
    public String lastName;
    public Optional<String> middleName;

    public Human(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = Optional.ofNullable(middleName);
    }

    public void printName() {
        String fullName = "";
        fullName += firstName;
        if(this.middleName.isPresent()) {
            fullName += " " + this.middleName.get();
        }
        fullName += " " + lastName;
        System.out.println(fullName);
    }
}
