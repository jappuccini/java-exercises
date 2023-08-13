package demo.lambdas;

import java.util.ArrayList;

import demo.lambdas.interfaces.AfterItemAdded;
import demo.lambdas.interfaces.AfterListPrinted;
import demo.lambdas.interfaces.ItemChanges;
import demo.lambdas.interfaces.ShoppingListItem;

public class ShoppingList {
    public ArrayList<ShoppingListItem> items = new ArrayList<>();
    private int itemCount = 0;
    private int changesCount = 0;
    private ArrayList<AfterItemAdded> afterItemAddedConsumers = new ArrayList<>();
    private ArrayList<AfterListPrinted> afterListPrintedConsumers = new ArrayList<>();
    private ArrayList<ItemChanges> itemChangesConsumers = new ArrayList<>();

    public void addItem(ShoppingListItem item) {
        item.setShoppingListId(itemCount++);
        this.items.add(item);
        incrementChange();
        notifyAfterItemAddedConsumers(item);
        notifyItemChangesConsumers();
    }

    public void removeItem(ShoppingListItem item) {
        items.remove(item.getShoppingListId());
        incrementChange();
        notifyItemChangesConsumers();
    }

    public void print() {
        for (ShoppingListItem item : items) {
            System.out.println(item.getDescription());
        }
        notifyAfterListPrintedConsumers();
    }

    public void addAfterItemAddedConsumer(AfterItemAdded afterItemAddedConsumer) {
        afterItemAddedConsumers.add(afterItemAddedConsumer);
    }

    public void addAfterListPrintedConsumer(AfterListPrinted afterListPrintedConsumer) {
        afterListPrintedConsumers.add(afterListPrintedConsumer);
    }

    public void addItemChangesConsumer(ItemChanges itemChangesConsumer) {
        itemChangesConsumers.add(itemChangesConsumer);
    }

    private void incrementChange() {
        changesCount++;
    }

    private void notifyAfterItemAddedConsumers(ShoppingListItem item) {
        for (AfterItemAdded afterItemAddedConsumer : afterItemAddedConsumers) {
            afterItemAddedConsumer.afterItemAdded(item);
        }
    }

    private void notifyAfterListPrintedConsumers() {
        for (AfterListPrinted afterListPrintedConsumer : afterListPrintedConsumers) {
            afterListPrintedConsumer.afterPrinted();
        }
    }

    private void notifyItemChangesConsumers() {
        for (ItemChanges itemChangesConsumer : itemChangesConsumers) {
            itemChangesConsumer.itemChanges(items, changesCount);
        }
    }
}
