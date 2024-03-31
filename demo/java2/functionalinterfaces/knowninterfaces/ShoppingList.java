package demo.java2.functionalinterfaces.knowninterfaces;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class ShoppingList {
    public Customer customer;
    public ArrayList<Product> products;
    private Consumer<ArrayList<Product>> productsChangedConsumer;
    private BiPredicate<Product, Customer> addAllowedChecker;

    public ShoppingList(Customer customer, BiPredicate<Product, Customer> addAllowedChecker) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.addAllowedChecker = addAllowedChecker;
    }

    public void addProduct(Product product) {
        if (addAllowedChecker.test(product, customer)) {
            this.products.add(product);
            this.productsChangedConsumer.accept(products);
        }
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        this.productsChangedConsumer.accept(products);
    }

    public void onProductsChanged(Consumer<ArrayList<Product>> productsChangedConsumer) {
        this.productsChangedConsumer = productsChangedConsumer;
    }
}
