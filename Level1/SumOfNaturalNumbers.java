
import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to compute the sum of natural numbers: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i; // Add the current number to the sum
                i++;         // Increment the counter
            }

            // Display results
            System.out.println("Sum computed using the formula: " + formulaSum);
            System.out.println("Sum computed using the while loop: " + loopSum);

            // Compare the two results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy between the computations.");
            }
        }

    }
}
