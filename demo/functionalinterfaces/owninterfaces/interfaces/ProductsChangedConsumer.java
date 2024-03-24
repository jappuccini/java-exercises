package demo.functionalinterfaces.owninterfaces.interfaces;

import java.util.ArrayList;

import demo.functionalinterfaces.owninterfaces.Product;

@FunctionalInterface
public interface ProductsChangedConsumer {
    public void execute(ArrayList<Product> products);
}
