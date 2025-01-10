import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = sc.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Print the rocket launch message
        System.out.println("Liftoff");

            }
}
