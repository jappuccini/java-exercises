package demo.records;

import java.util.Objects;

public class Cat {
    private final String name;
    private final int age;
    private final int height;

    public Cat(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public int height() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        } else {
            Cat cat = (Cat) o;
            if (cat.age() == this.age() && cat.name().equals(this.name()) && this.height == cat.height()) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.name(), this.age(), this.height());
    }

    @Override
    public String toString() {
        return "Cat [name = " + name + "] [age= " + age + "] [height = " + height + "]";
    }
}
