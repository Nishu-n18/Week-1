
import java.util.*;

public class ConvertKilotoMiles1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km"
        );
    }
}
