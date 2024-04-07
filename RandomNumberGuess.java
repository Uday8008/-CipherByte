package cipherbyte;
import java.util.Random;
import javax.swing.JOptionPane;
public class RandomNumberGuess {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Prompt the user to enter their number
        String userInput = JOptionPane.showInputDialog(null, "Please guess a number between " + min + " and " + max + ":");

        // Convert the user input to an integer
        int userGuess = Integer.parseInt(userInput);

        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number within the range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Compare user's guess with the generated random number
        if (userGuess == randomNumber) {
            JOptionPane.showMessageDialog(null, "Congratulations! Your guess was correct.");
        } else if (userGuess < randomNumber) {
            JOptionPane.showMessageDialog(null, "Your guess is too low. The correct number was: " + randomNumber);
        } else {
            JOptionPane.showMessageDialog(null, "Your guess is too high. The correct number was: " + randomNumber);
        }
    }
}
