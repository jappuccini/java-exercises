package demo.exceptions;

public class Example {
    public static void main(String[] args) {
        try {
            PasswordChecker.checkPassword("I<3ABAP!!!!!!!!!!!");
            System.out.println("Nach Check");
        } 
        /* 
        catch (Exception e) {
            if(e instanceof PasswordTooLongException) {
                PasswordTooLongException tooLongException = (PasswordTooLongException) e;
                // fehler behandlung für too long
            }
            if(e instanceof PasswordTooShortException) {
                PasswordTooShortException tooShortException = (PasswordTooShortException) e;
                // fehler behandlung für too short
            }
        }
        */
        catch (PasswordTooShortException e) {
            System.out.println(e.getMessage());
            System.out.println("Kennwort ist um " +  e.tooShortBy + " Zeichen zu kurz!");
        } catch (PasswordTooLongException e) {
            System.out.println("Kennwort ist um " +  e.tooLongBy + " Zeichen zu lang!");
        }
        
    }
}
