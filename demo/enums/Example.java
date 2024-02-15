package demo.enums;

public class Example {

    public static void main(String[] args) {
        Gender[] allGenders = Gender.values();
        for (Gender gender : allGenders) {
            System.out.println(gender.getShortForm());
            System.out.println(gender.ordinal());
        }

        Human steffen = new Human();
        steffen.gender = Gender.MALE;
        if (steffen.gender.isBinary()) {
            System.out.println("Ich bin binär!");
        } else {
            System.out.println("Ich bin nicht binär!");
        }
    }

}
