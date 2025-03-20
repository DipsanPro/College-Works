import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        int side1;
        int side2;
        int sum1 = 0;
        int sum2 = 0;
        int num1;
        int num2;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sides for dice 1: ");
        side1 = scanner.nextInt();

        System.out.print("Enter number of sides for dice 2: ");
        side2 = scanner.nextInt();

        // Roll the dice 3 times
        for (int i = 1; i <= 3; i++) {
            num1 = rand.nextInt(side1) + 1;
            num2 = rand.nextInt(side2) + 1;

            // Output the result of each roll
            System.out.println("The number for roll " + i + " in first DIE is : " + num1);
            System.out.println("The number for roll " + i + " in second DIE is : " + num2);

            sum1 += num1;
            sum2 += num2;
        }

        System.out.println("The sum of first DIE is : " + sum1+" and the average is: " +sum1/3);
        System.out.println("The sum of second DIE is : " + sum2+" and the average is: " +sum2/3);

        scanner.close();
    }
}
