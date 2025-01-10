
import java.util.*;

public class HeightConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double cmPerInch = 2.54;
        double inchesPerFoot = 12;
        double heightInch = heightCm / cmPerInch;
        double heightFeet = heightInch / inchesPerFoot;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInch
        );

    }
}
