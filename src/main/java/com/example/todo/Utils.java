package main.java.com.example.todo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static List<Task> sortTasksById(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparingInt(Task::getId))
                .collect(Collectors.toList());
    }

    public static List<Task> filterCompletedTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }

    public static List<Task> filterIncompleteTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }
}
