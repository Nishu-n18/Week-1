
import java.util.*;

public class BMI2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] data = new double[numPersons][3]; // [0] = height, [1] = weight, [2] = BMI
        String[] weightStatus = new String[numPersons];

        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input height
            while (true) {
                System.out.print("Height (in meters): ");
                double height = input.nextDouble();
                if (height > 0) {
                    data[i][0] = height;
                    break;
                } else {
                    System.out.println("Height must be positive. Please enter a valid height.");
                }
            }

            // Input weight
            while (true) {
                System.out.print("Weight (in kg): ");
                double weight = input.nextDouble();
                if (weight > 0) {
                    data[i][1] = weight;
                    break;
                } else {
                    System.out.println("Weight must be positive. Please enter a valid weight.");
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI and store it in the 2D array
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);

            // Determine weight status based on BMI
            if (data[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (data[i][2] >= 25.0 && data[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("------------------------------------------------------------");
        System.out.println("| Person | Height (m) | Weight (kg) | BMI      | Status       |");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("|   %d    |    %.2f    |    %.2f    |  %.2f   |  %s  |\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], weightStatus[i]);
        }
    }
}
