package demo.interfaces;

import demo.interfaces.animal.Dog;
import demo.interfaces.animal.Cat;
import demo.interfaces.shoppingcart.ShoppingCart;
import demo.interfaces.todolist.TodoList;

public class Example {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToShoppingCart(new Dog());
        shoppingCart.addToShoppingCart(new Cat());
        shoppingCart.print();


        TodoList todoList = new TodoList();
        todoList.addTodo(new Dog());
        todoList.print();
    }
}
