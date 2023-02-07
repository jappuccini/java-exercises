package demo.enums;

public class Human {
    public Gender gender;

    public void printGender() {
        switch (gender) {
            case MALE:
               System.out.println("Ich bin ein Mann");
                break;
            case FEMALE:
               System.out.println("Ich bin eine Frau");
                break;
            case DIVERS:
               System.out.println("Ich bin divers.");
                break;
            default:
                break;
        }
    }
    
}
