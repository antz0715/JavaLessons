import java.util.ArrayList;
import java.util.Scanner;
// arraylists are dynamic
public class todosimple {

    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private static void viewTasks() {
        System.out.println("To-Do List:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks added.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        viewTasks();
        System.out.print("Enter the number of the task to remove: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number. Please try again.");
        } else {
            tasks.remove(taskNumber - 1);
            System.out.println("Task removed.");
        }
    }
}
