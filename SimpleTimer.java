import java.util.Scanner;

public class SimpleTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds for the countdown
        System.out.print("Enter the number of seconds for the countdown: ");
        int seconds = scanner.nextInt();

        // Start the countdown
        for (int i = seconds; i > 0; i--) {
            System.out.println("Time left: " + i + " seconds");
            try {
                // Wait for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted.");
            }
        }

        // Print a message when the countdown is complete
        System.out.println("Countdown complete!");

        // Close the scanner
        scanner.close();
    }
}
