
import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Take user input for a number. 
        int number = input.nextInt();
        int count = 0;
        int num = number;
        while (num != 0) {
            num = num / 10;
            count++;//Find the count of digits 
        }
//Create an array to store the elements of the digits array in reverse order

        int reverse[] = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);//display the elements of the array in reverse order  

        }
    }
}
