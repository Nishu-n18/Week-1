
import java.util.*;

public class YoungestFriend {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take user input for age
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int age[] = new int[3];
        int height[] = new int[3];
        int youngest = 0;
        int tall = 0;
//Loop through the array
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + friends[i]);
            age[i] = input.nextInt();
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            System.out.println("Enter the height of " + friends[i]);
            height[i] = input.nextInt();
            if (height[i] > height[tall]) {
                tall = i;
            }
        }
//display the youngest and tallest of the 3 friends

        System.out.println("The youngest friend is " + friends[youngest] + " with age " + age[youngest] + ".");
        System.out.println("The tallest friend is " + friends[tall] + " with height " + height[tall] + " cm.");

    }
}
