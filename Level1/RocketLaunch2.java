import java.util.*;

public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = sc.nextInt();

        // Countdown using a for loop
        for (int i = counter; i > 0; i--) { // Start from the user input and decrement
            System.out.println(i); // Print the current value
        }

        // Print the rocket launch message
        System.out.println("Liftoff");

           }
}
