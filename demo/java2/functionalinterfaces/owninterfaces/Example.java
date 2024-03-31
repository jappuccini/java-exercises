package demo.java2.functionalinterfaces.owninterfaces;

public class Example {
    public static void main(String[] args) {
        ShoppingList amazing = new ShoppingList(new Customer("Steffen", 1000, 18),
                (product, customer) -> product.price() < customer.credit());

        // Ein Parameter lange Syntax
        amazing.onProductsChanged((products) -> {
            System.out.println("Products changed! Size: " + products.size());
        });

        amazing.addProduct(new Product("BMW", 30000));
        System.out.println(amazing.products.size());

    }
}
