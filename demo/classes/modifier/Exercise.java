package demo.classes.modifier;

public class Exercise {
    
    public static void main(String[] args) {
        Human steffen = new Human();
        // auf firstName kann zugegriffen werden, da public
        steffen.firstName = "Steffen";
        // auf age kann nicht zugegriffen werden, da private
        // steffen.age

        steffen.setAge(28);
        System.out.println(steffen.getAge());
    }
}
