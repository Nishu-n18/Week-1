
import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int Array[] = new int[11];
        // store value in an array
        for (int i = 1; i <= 10; i++) {
            Array[i] = number * i;
        }
        //Result from array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + Array[i]);

        }
    }
}
