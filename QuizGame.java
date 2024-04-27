import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Questions for the quiz
        String[] questions = {
            "What is the capital of France?",
            "What planet is known as the Red Planet?",
            "What gas do plants breathe in that humans and animals breathe out?",
            "How many continents are there on Earth?",
            "What is the boiling point of water in degrees Celsius?"
        };

        // Correct answers corresponding to the questions
        String[] answers = {"Paris", "Mars", "Carbon Dioxide", "7", "100"};

        int score = 0;  // Initialize score
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz! Answer the following questions:");

        // Process each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);  // Display the question
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();  // Read the user's answer

            // Check if the user's answer matches the correct answer (ignoring case)
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;  // Increase score for correct answers
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i]);
            }
        }

        // Show final score
        System.out.println("\nYou scored " + score + " out of " + questions.length);
        scanner.close();  // Close the scanner
    }
}
