package demo.java2.functionalinterfaces.owninterfaces.interfaces;

import java.util.ArrayList;

import demo.java2.functionalinterfaces.owninterfaces.Product;


@FunctionalInterface
public interface ProductsChangedConsumer {
    public void execute(ArrayList<Product> products);
}
