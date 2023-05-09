package printableinterface;

public class Todo implements Printable, Comparable<Todo> {
    private String task;
    private String priority;
    private boolean isDone;

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    @Override
    public void printAllFields() {
        // should look like: Task: Buy milk | Priority: high | Done: true
        System.out.println("Task: " + getTask() + " | " + "Priority: " + getPriority() + " | " + "Done: " + isDone());
    }

    public String toString() {
        return ("[" + isDone() + ", " + getTask() + "]");
    }

    @Override
    public int compareTo(Todo o) {
        if (this.isDone()) {
            return -1;
        } else {
            return 1;
        }
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

}
