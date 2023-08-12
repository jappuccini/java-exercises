package demo.recap;

public class Example {
    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList();
        Human steffen = new Human("Steffen", "Merk");
        shoppingList.addItem(steffen);

        Car beamer = new Car("BMW", "320");
        shoppingList.addItem(beamer);

        Dog bello = new Dog("Bello");
        shoppingList.addItem(bello);

        shoppingList.print();

        
    }
}
