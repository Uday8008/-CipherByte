package cipherbyte;

import java.util.Random;
import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Prompt the user to enter their number
        String userInput = JOptionPane.showInputDialog(null, "Please enter your given number:");

        // Convert the user input to an integer
        int userNumber = Integer.parseInt(userInput);

        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number within the range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Display the generated random number
        JOptionPane.showMessageDialog(null, "Random Number between " + min + " and " + max + ": " + randomNumber);
    }
}

