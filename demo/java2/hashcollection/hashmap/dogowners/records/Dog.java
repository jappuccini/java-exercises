package demo.java2.hashcollection.hashmap.dogowners.records;

import java.util.Objects;

public class Dog {
    public final String name;
    public final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // int hashCode = super.hashCode();
        int hashCode = Objects.hash(this.name, this.age);
        System.out.println("Hash Code Called --> " + hashCode);
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals Called --> " + o);
        // return true;
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        if (this.name.equals(dog.name) && this.age == dog.age) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog [name=" + this.name + "], [age=" + this.age + "]";
    }
}
