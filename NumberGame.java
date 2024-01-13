import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Game!");

        while (true) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Additional details
            int attemptsLimit = 10;
            int attemptsTaken = 0;

            while (attemptsTaken < attemptsLimit) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attemptsTaken++;
            }

            // Step 5: Display the result and score
            if (attemptsTaken < attemptsLimit) {
                System.out.println("You guessed the number in " + (attemptsTaken + 1) + " attempts!");
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
            }

            // Step 6: Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
