package demo.java2.functionalinterfaces.owninterfaces.interfaces;

import demo.java2.functionalinterfaces.owninterfaces.Customer;
import demo.java2.functionalinterfaces.owninterfaces.Product;

@FunctionalInterface
public interface AddAllowedChecker {
    public boolean allowed(Product product, Customer customer);
}
