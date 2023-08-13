package demo.lambdas.interfaces;

import java.util.ArrayList;

@FunctionalInterface
public interface ItemChanges {
    public void itemChanges(ArrayList<ShoppingListItem> items, int count);
}
