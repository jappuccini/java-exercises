package demo.lambdas;

import demo.lambdas.interfaces.ShoppingListItem;

public class Car implements ShoppingListItem {
    private String brand;
    private String model;
    private int shoppingListId;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setShoppingListId(int shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public int getShoppingListId() {
        return shoppingListId;
    }

    public String getDescription() {
        return brand + " " + model;
    }

}
