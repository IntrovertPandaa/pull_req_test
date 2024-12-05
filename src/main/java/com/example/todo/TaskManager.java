package main.java.com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        // TODO: Implement this method
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
