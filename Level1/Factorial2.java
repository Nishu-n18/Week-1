import java.util.*;

public class Factorial2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Initialize the factorial variable to 1

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the current factorial value by i
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

     }
}
