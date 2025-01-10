
import java.util.*;

public class StudentGrades2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    int mark = input.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks cannot be negative. Please enter positive marks.");
                    }
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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

        // Display results
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student" + " "
                    + (i + 1) + " Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " Percentages: " + percentages[i] + " Grade:" + grades[i]);
        }
    }
}
