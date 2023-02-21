package demo.interfaces.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addToShoppingCart(Item item) {
        this.items.add(item);
    }

    public void print() {
        for (Item item : items) {
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: " + item.getPrice());
        }
    }
    
}
