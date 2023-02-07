package demo.enums;

public class Example {

    public static void main(String[] args) {
        Gender[] allGenders = Gender.values();
        for (Gender gender : allGenders) {
           System.out.println(gender.getShortForm()); 
           System.out.println(gender.ordinal()); 
        }
    }

}
