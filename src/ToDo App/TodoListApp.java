import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoListApp {
    private static final String TASK_FILE = "src/tasks.txt";

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];
        switch (command) {
            case "-l" -> listTasks();
            case "-a" -> {
                if (args.length < 2) {
                    System.out.println("Unable to add: no task provided");
                } else {
                    String taskDescription = args[1];
                    addTask(taskDescription);
                }
            }
            case "-r" -> {
                if (args.length < 2) {
                    System.out.println("Unable to remove: no index provided");
                } else {
                    String indexStr = args[1];
                    removeTask(indexStr);
                }
            }
            case "-c" -> {
                if (args.length < 2) {
                    System.out.println("Unable to check: no index provided");
                } else {
                    String indexStr = args[1];
                    checkTask(indexStr);
                }
            }
            default -> {
                System.out.println("Unsupported argument");
                printUsage();
            }
        }
    }

    private static void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Adds a new task");
        System.out.println(" -r   Removes a task");
        System.out.println(" -c   Completes a task");
    }

    private static void listTasks() {
        List<String> tasks = readTasksFromFile();
        if (tasks.isEmpty()) {
            System.out.println("No todos for today! :)");
        } else {
            for (int i = 1; i < tasks.size(); i++) {
                String task = tasks.get(i);
                System.out.println(i + " - " + task);
            }
        }
    }

    private static void addTask(String taskDescription) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TASK_FILE, true))) {
            writer.println(taskDescription);
            System.out.println("Task added successfully!");
        } catch (IOException e) {
            System.out.println("Unable to add task: " + e.getMessage());
        }
    }

    private static void removeTask(String indexStr) {
        try {
            int index = Integer.parseInt(indexStr);
            List<String> tasks = readTasksFromFile();
            if (index < 1 || index > tasks.size()) {
                System.out.println("Unable to remove: index is out of bound");
            } else {
                tasks.remove(index - 1);
                writeTasksToFile(tasks);
                System.out.println("Task removed successfully!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to remove: index is not a number");
        }
    }

    private static void checkTask(String indexStr) {
        try {
            int index = Integer.parseInt(indexStr);
            List<String> tasks = readTasksFromFile();
            if (index < 1 || index > tasks.size()) {
                System.out.println("Unable to check: index is out of bound");
            } else {
                String task = tasks.get(index - 1);
                tasks.set(index - 1, "[x] " + task);
                writeTasksToFile(tasks);
                System.out.println("Task checked successfully!");
            }
        } catch (
                NumberFormatException e) {
            System.out.println("Unable to check: index is not a number");
        }
    }

    private static List<String> readTasksFromFile() {
        List<String> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TASK_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading tasks from file: " + e.getMessage());
        }
        return tasks;
    }

    private static void writeTasksToFile(List<String> tasks) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TASK_FILE))) {
            for (String task : tasks) {
                writer.println(task);
            }
        } catch (IOException e) {
            System.out.println("Error writing tasks to file: " + e.getMessage());
        }
    }
}
