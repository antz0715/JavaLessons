import java.util.Scanner;

public class TodoList {
    private static String[] tasks = new String[10];  // Array to store up to 10 tasks
    private static boolean[] isCompleted = new boolean[10];  // Array to track completion status of tasks
    private static int taskCount = 0;  // Counter to keep track of the number of tasks

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTodo List - Choose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    completeTask(scanner);
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        if (taskCount < tasks.length) {
            System.out.print("Enter a new task: ");
            tasks[taskCount] = scanner.nextLine();
            isCompleted[taskCount] = false;
            taskCount++;
            System.out.println("Task added.");
        } else {
            System.out.println("Task list is full. Cannot add more tasks.");
        }
    }

    private static void completeTask(Scanner scanner) {
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt() - 1;  // Adjust for index starting at 0
        if (taskNumber >= 0 && taskNumber < taskCount) {
            isCompleted[taskNumber] = true;
            System.out.println("Task " + (taskNumber + 1) + " marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void showTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks added yet.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < taskCount; i++) {
                String status = isCompleted[i] ? "Completed" : "Pending";
                System.out.println((i + 1) + ". " + tasks[i] + " [" + status + "]");
            }
        }
    }
}
