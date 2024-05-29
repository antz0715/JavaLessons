import java.util.Scanner;

public class SimpleStopwatch {
    private static boolean running = false;
    private static long startTime = 0;
    private static long elapsedTime = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        
        while (true) {
            // Display the menu options
            System.out.println("\nStopwatch Menu:");
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Reset");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            command = scanner.nextLine();
            
            switch (command) {
                case "1":
                    start();
                    break;
                case "2":
                    stop();
                    break;
                case "3":
                    reset();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void start() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis() - elapsedTime;
            System.out.println("Stopwatch started.");
            Thread thread = new Thread(() -> {
                while (running) {
                    elapsedTime = System.currentTimeMillis() - startTime;
                    try {
                        Thread.sleep(100); // Update every 100 milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public static void stop() {
        if (running) {
            running = false;
            elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Stopwatch stopped. Elapsed time: " + formatTime(elapsedTime));
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public static void reset() {
        running = false;
        elapsedTime = 0;
        System.out.println("Stopwatch reset.");
    }

    public static String formatTime(long milliseconds) {
        long seconds = (milliseconds / 1000) % 60;
        long minutes = (milliseconds / (1000 * 60)) % 60;
        long hours = (milliseconds / (1000 * 60 * 60)) % 24;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
