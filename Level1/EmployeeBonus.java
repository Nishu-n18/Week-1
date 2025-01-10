import java.util.*;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // Calculate the bonus if years of service are more than 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with " + yearsOfService + " years of service.");
        }

    }
}


