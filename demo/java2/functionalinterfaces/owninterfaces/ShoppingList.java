package demo.java2.functionalinterfaces.owninterfaces;

import java.util.ArrayList;

import demo.java2.functionalinterfaces.owninterfaces.interfaces.AddAllowedChecker;
import demo.java2.functionalinterfaces.owninterfaces.interfaces.ProductsChangedConsumer;


public class ShoppingList {
    public Customer customer;
    public ArrayList<Product> products;
    private ProductsChangedConsumer productsChangedConsumer;
    private AddAllowedChecker addAllowedChecker;

    public ShoppingList(Customer customer, AddAllowedChecker addAllowedChecker) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.addAllowedChecker = addAllowedChecker;
    }

    public void addProduct(Product product) {
        if (addAllowedChecker.allowed(product, customer)) {
            this.products.add(product);
            this.productsChangedConsumer.execute(products);
        }
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        this.productsChangedConsumer.execute(products);
    }

    public void onProductsChanged(ProductsChangedConsumer productsChangedConsumer) {
        this.productsChangedConsumer = productsChangedConsumer;
    }
}
