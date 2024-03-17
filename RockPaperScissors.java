/* this is a program that plays Rock, Paper, Scissors.
*
* @author  Samuel Webster
* @version 1.0
* @since   2024-01-01
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard RockPaperScissors program.
*/
final class RockPaperScissors {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function simulates a game of "rock-paper-scissors".
    *
    * @param userChoice  int for player refering to rock, paper, or scissors
    * @param computerChoice  int for computer: rock, paper, or scissors
    *
    * @return The outcome of the game.
    */
    public static String rockPaperScissors(int userChoice, int computerChoice) {
        String output = "";
        final int numberOfChoices = 3;
        if (userChoice == computerChoice) {
            output = "tie";
        } else if ((userChoice + 1) % numberOfChoices == computerChoice) {
            output = "lose";
        } else {
            output = "win";
        }
        return output;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // variables
        final String[] choices = {"rock", "paper", "scissors"};
        String output = "";

        final Random random = new Random();
        final int computerChoice = random.nextInt(3);

        // Input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("rock, paper, or scissors? (lowercase): ");
        final String userInputString = scanner.nextLine().trim();

        // Error check
        if (userInputString.equals(choices[0])) {
            output = rockPaperScissors(0, computerChoice);
        } else if (userInputString.equals(choices[1])) {
            output = rockPaperScissors(1, computerChoice);
        } else if (userInputString.equals(choices[2])) {
            output = rockPaperScissors(2, computerChoice);
        } else {
            output = "entered invalid input";
        }
        System.out.println(
            "You played " + userInputString + " and the computer played "
            + choices[computerChoice] + ". You " + output
        );

        System.out.println("\nDone.");
    }
}
