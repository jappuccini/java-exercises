package demo.enums;

public enum Gender {
    FEMALE('F', "Female"),
    MALE('M', "Male"),
    DIVERS('D', "Divers");

    private char shortForm;
    private String longForm;

    Gender(char shortForm, String longFrom) {
        this.shortForm = shortForm;
        this.longForm = longFrom;
    }

    public char getShortForm() {
        return shortForm;
    }

    public boolean isBinary() {
        return this != Gender.DIVERS;
    }
}
