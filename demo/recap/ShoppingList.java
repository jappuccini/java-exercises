package demo.recap;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void print() {
        for (Item item : items) {
            System.out.println(item.getDescription());
        }
    }
}
