import java.util.*;

public class DistributePens {

    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int distributeEqually = pens / students;
        int remainingPens = pens % students;
        System.out.println("The Pen Per Student is " + distributeEqually + " and the remaining pen not distributed is " + remainingPens
        );
    }
}
