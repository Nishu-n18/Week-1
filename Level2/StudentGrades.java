
import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        //  Create arrays to store marks, percentages, and grades
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics
            while (true) {
                System.out.print("Physics: ");
                int mark = input.nextInt();
                if (mark >= 0) {
                    physics[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter positive marks.");
                }
            }

            // Input marks for Chemistry
            while (true) {
                System.out.print("Chemistry: ");
                int mark = input.nextInt();
                if (mark >= 0) {
                    chemistry[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter positive marks.");
                }
            }

            // Input marks for Maths
            while (true) {
                System.out.print("Maths: ");
                int mark = input.nextInt();
                if (mark >= 0) {
                    maths[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Please enter positive marks.");
                }
            }
        }

        // Step 4: Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = totalMarks / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = " A (Level 4, above agency-normalized standards)";
            } else if (percentages[i] >= 70) {
                grades[i] = " B (Level 3, at agency-normalized standards)";
            } else if (percentages[i] >= 60) {
                grades[i] = " C (Level 2, below, but approaching agency-normalized standards)";
            } else if (percentages[i] >= 50) {
                grades[i] = " D (Level 1, well below agency-normalized standards)";
            } else if (percentages[i] >= 40) {
                grades[i] = " E (Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = " R (Remedial standards)";
            }

        }

        // Step 5: Display results
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student "
                    + (i + 1) + " " + physics[i] + " " + chemistry[i] + " " + maths[i] + " " + percentages[i] + " " + grades[i]);
        }
    }
}
