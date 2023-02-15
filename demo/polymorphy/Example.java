package demo.polymorphy;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        Dog bello = new Dog();
        Animal animalOne = bello; // upcast von Dog zu Animal
        animalOne.makeSound();
        // Alternativ: Animal animal = new Dog();

        Dog castedBello =  (Dog) animalOne; // downcast von Animal zu Dog
        castedBello.bark();


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        for (Animal animal : animals) {

            if(animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();
            }

            if(animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.meow();
            }
        }
    }
}
