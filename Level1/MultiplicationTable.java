import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        // Generate and print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
