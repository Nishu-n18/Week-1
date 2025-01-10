import java.util.*;

public class EarthVolume {

    public static void main(String[] args) {
        double radius = 6378;
        double radiusInMiles = 0.621371 * radius;
        double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles
        );
    }
}
