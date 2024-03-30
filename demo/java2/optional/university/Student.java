package demo.java2.optional.university;

public class Student {
    public final String name;
    public final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + " Alter: " + age;
    }
}
