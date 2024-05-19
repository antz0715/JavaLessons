import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock-Paper-Scissors game!");
        boolean playAgain = true;

        while (playAgain) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            while (!isValidChoice(userChoice)) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win! Rock crushes scissors." : "You lose! Paper covers rock.";
            case "paper":
                return computerChoice.equals("rock") ? "You win! Paper covers rock." : "You lose! Scissors cut paper.";
            case "scissors":
                return computerChoice.equals("paper") ? "You win! Scissors cut paper." : "You lose! Rock crushes scissors.";
            default:
                return "Unexpected result.";
        }
    }
}
