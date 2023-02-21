package demo.interfaces.animal;

import demo.interfaces.shoppingcart.Item;

public class Cat extends Animal implements Item{

    public String getDescription() {
        return "Ciao. Miau. Willst du mich au?";
    }

    public double getPrice() {
        return 9999999999.99;
    }
    
}
