
import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the input for a numberS
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        //Define a frequency array of size 10
        int[] frequency = new int[10];

        //  Calculate the frequency of each digit
        while (number > 0) {
            int digit = (int) (number % 10);
            frequency[digit]++;
            number /= 10;
        }

        //  Display the frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
