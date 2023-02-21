package demo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
       ArrayList<Human> humans = new ArrayList<>();
       humans.add(new Human("Chris", 27));
       humans.add(new Human("Bernhard", 23));
       humans.add(new Human("Anton", 24));

       System.out.println("Before sort:");
       for (Human human : humans) {
        System.out.println(human.getName());
       }
       System.out.println();


       Collections.sort(humans);
       System.out.println("After comparable sort:");
       for (Human human : humans) {
        System.out.println(human.getName());
       }
       System.out.println();

       Collections.sort(humans, new AgeComparator());
       System.out.println("After comparator sort:");
       for (Human human : humans) {
        System.out.println(human.getName());
       }
       System.out.println();
    }
}
