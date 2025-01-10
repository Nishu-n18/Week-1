import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the entered number is a natural number
        if (number < 1) {
            System.out.println("Please enter a valid natural number (greater than or equal to 1).");
        } else {
            // Iterate from 1 to the entered number using a for loop
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }

    }
}
