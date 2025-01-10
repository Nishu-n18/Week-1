import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Initialize the total sum to 0.0

        while (true) { // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = sc.nextDouble(); // Get user input

            if (userInput <= 0) { // Check if the input is 0 or negative
                break; // Exit the loop
            }

            total += userInput; // Add the input to the total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

            }
}
