
import java.util.*;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 10;
        int[] studentAge = new int[student];
        for (int i = 0; i < student; i++) {
            studentAge[i] = sc.nextInt();
        }
        for (int i = 0; i < studentAge.length; i++) {
// if age is less than 0, it prints invalid age.
            if (studentAge[i] < 0) {
                System.out.println("Invalid Age");
            } else if (studentAge[i] >= 18) {
// if age is greater than or equal to 18, it prints can vote.
                System.out.println("The student with the age " + studentAge[i] + " can vote");
            } else {
                System.out.println("The student with the age " + studentAge[i] + " can not vote");
            }
        }
    }
}
