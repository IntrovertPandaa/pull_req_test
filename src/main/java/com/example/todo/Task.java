package main.java.com.example.todo;

/**
 * Represents a task in the to-do list.
 * Each task has a unique ID, a description, and a status indicating whether it is completed.
 */
public class Task {
    private int id; // Unique identifier for the task
    private String description; // Description of the task
    private boolean completed; // Status of the task: true if completed, false otherwise

    /**
     * Constructs a new Task with the specified ID, description, and completion status.
     *
     * @param id          The unique identifier for the task.
     * @param description The description of the task.
     * @param completed   The completion status of the task. True if completed, false otherwise.
     */
    public Task(int id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    /**
     * Returns the unique identifier of the task.
     *
     * @return The task's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the description of the task.
     *
     * @return The task's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns whether the task is completed.
     *
     * @return True if the task is completed, false otherwise.
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the completion status of the task.
     *
     * @param completed The new completion status of the task.
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Returns a string representation of the task.
     * Includes the ID, description, and completion status.
     *
     * @return A string representation of the task.
     */
    @Override
    public String toString() {
        return id + ". " + description + " [Completed: " + completed + "]";
    }
}
