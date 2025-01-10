
import java.util.*;

public class Distance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();
        double distanceInYard = distanceInFeet / 3.0;
        double distanceInMile = distanceInYard / 1760;

        System.out.println("The distance in Yard " + distanceInYard + " yard and in Miles " + distanceInMile + " for the given distance " + distanceInFeet + " Feet");
    }
}
