package demo.lambdas;

public class Example {
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        // Ein Parameter lange Syntax
        sl.addAfterItemAddedConsumer((item) -> {
            System.out.println("Item wurde hinzugefügt!");
        });
        // Ein Parameter kurze Syntax
        sl.addAfterItemAddedConsumer(item -> System.out.println("Item wurde hinzugefügt!"));

        // Kein Parameter lange Syntax
        sl.addAfterListPrintedConsumer(() -> {
            System.out.println("Liste wurde ausgegeben!");
        });

        // Kein Parameter kurze Syntax
        sl.addAfterListPrintedConsumer(() -> System.out.println("Liste wurde ausgegeben!"));

        // Zwei Parameter lange Syntax
        sl.addItemChangesConsumer((items, changeCount) -> {
            System.out.println("Items wurde " + changeCount + " mal geändert!");
        });

        // Zwei Parameter kurze Syntax
        sl.addItemChangesConsumer((items, changeCount) -> System.out.println("Change nummer: " + changeCount));

    }
}
