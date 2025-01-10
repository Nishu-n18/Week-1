import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Initialize the total sum to 0.0
        double userInput;  // Variable to store user input

        // Start the while loop
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble(); // Take user input

            // Check if the input is 0
            if (userInput == 0) {
                break;             }

            total += userInput;         }

        // Display the total sum
        System.out.println("The total sum is: " + total);

           }
}
