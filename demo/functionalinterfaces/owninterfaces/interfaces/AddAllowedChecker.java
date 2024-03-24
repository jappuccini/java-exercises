package demo.functionalinterfaces.owninterfaces.interfaces;

import demo.functionalinterfaces.owninterfaces.Customer;
import demo.functionalinterfaces.owninterfaces.Product;

@FunctionalInterface
public interface AddAllowedChecker {
    public boolean allowed(Product product, Customer customer);
}
