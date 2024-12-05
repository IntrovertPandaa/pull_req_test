package main.java.com.example.todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();

        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove(); // Safely removes the task while iterating
                System.out.println("Task with ID " + id + " removed.");
                return;
            }
        }

        System.out.println("Task with ID " + id + " not found.");
    }

    public void markTaskAsCompleted(int id) {
        // TODO: Implement this method
    }

    public void printAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
