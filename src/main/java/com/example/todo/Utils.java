package main.java.com.example.todo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    /**
     * Sorts a list of tasks by their ID in ascending order.
     * 
     * @param tasks The list of tasks to sort.
     * @return A new list of tasks sorted by ID.
     */
    public static List<Task> sortTasksById(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparingInt(Task::getId))
                .collect(Collectors.toList());
    }

    /**
     * Filters the list of tasks to include only completed tasks.
     * 
     * @param tasks The list of tasks to filter.
     * @return A new list containing only complete tasks.
     */
    public static List<Task> filterCompletedTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }

    /**
     * Filters the list of tasks to include only incomplete tasks.
     * 
     * @param tasks The list of tasks to filter.
     * @return A new list containing only incomplete tasks.
     */
    public static List<Task> filterIncompleteTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }
}
