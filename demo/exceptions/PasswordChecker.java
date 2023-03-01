package demo.exceptions;

public class PasswordChecker {
    public static void checkPassword(String password) throws PasswordTooShortException, PasswordTooLongException {
        if(password.length() < 8) {
            int tooShortBy = 8 - password.length();
            throw new PasswordTooShortException(tooShortBy);
        }
        if(password.length() > 10) {
            int tooLongBy = password.length() - 10;
            throw new PasswordTooLongException(tooLongBy);
        }
    }
}
