package demo.controlflow;

public class TernaryOperator {
    public static void main(String[] args) {
        String titleIf = TernaryOperator.getTitleIf(false);
        System.out.println(titleIf);
        String titleTernary = TernaryOperator.getTitleTernaryOperator(false);
        System.out.println(titleTernary);
    }

    public static String getTitleIf(boolean isFemale) {
        if (isFemale) {
            return "Frau";
        } else {
            return "Herr";
        }
    }

    public static String getTitleTernaryOperator(boolean isFemale) {
        return isFemale ? "Frau" : "Herr";
    }
}
