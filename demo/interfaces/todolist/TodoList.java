package demo.interfaces.todolist;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoItem> todoItems;

    public TodoList() {
        this.todoItems = new ArrayList<>();
    }

    public void addTodo(TodoItem todoItem) {
        this.todoItems.add(todoItem);
    }

    public void print() {
        for (TodoItem todoItem : todoItems) {
            System.out.println(todoItem.getTitle());
            System.out.println("is done?" + todoItem.isDone());
        }
    }
}
