package demo.abstraction;

public class Dackel extends Dog {

    public void bark() { 
        /* 
          Diese Methode kann nicht überschrieben werden,
          da bark als finale Methode in der Dog Klasse deklariert wurde.
        */
    }
    
}
