package demo.classes.modifier;

public class Human {
    public String firstName;
    public String lastName;
    private int age;

    public String getFullName() {
        return firstName + lastName;
    }

    public void setAge(int age) {
        // System.out.println("Start der Methode: " + age);
        if (isValidAge(age)) {
            this.age = age;
            // age = this.age;
            // System.out.println("innerhalb if (age): " + age);
            // System.out.println("innerhalb if (this.age): " + this.age);
        }
    }

    // private Methode zur 
    private boolean isValidAge(int age) {
        return  age > 0 && age < 124;
    }

    public int getAge() {
        // return this.age; ist auch möglich, aber unüblich in der Praxis
        return age;
    }
}