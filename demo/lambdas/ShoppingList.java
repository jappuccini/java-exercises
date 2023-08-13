package demo.lambdas;

import java.util.ArrayList;

import demo.lambdas.interfaces.ShoppingListItem;

public class ShoppingList {
    public ArrayList<ShoppingListItem> items = new ArrayList<>();
    private int itemCount = 0;

    public void addItem(ShoppingListItem item) {
        item.setShoppingListId(itemCount++);
        this.items.add(item);
    }

    public void removeItem(ShoppingListItem item) {
        items.remove(item.getShoppingListId());
    }

    public void print() {
        for (ShoppingListItem item : items) {
            System.out.println(item.getDescription());
        }
    }
}