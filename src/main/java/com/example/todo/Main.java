package main.java.com.example.todo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List App!");

        TaskManager manager = new TaskManager();
        // Add test data
        manager.addTask(new Task(1, "Finish the project", false));
        manager.addTask(new Task(2, "Read a book", false));

        // Print all tasks
        System.out.println("Current tasks:");
        manager.printAllTasks();
    }
}

