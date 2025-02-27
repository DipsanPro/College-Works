import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the numerator and denominator
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Check if the denominator is 0 to avoid division by zero
        if (denominator != 0) {
            // Calculate the decimal equivalent
            double decimalEquivalent = (double) numerator / denominator;

            // Display the result
            System.out.printf("The decimal equivalent of %d/%d is %.4f\n", numerator, denominator, decimalEquivalent);
        } else {
            System.out.println("Error: Denominator cannot be zero.");
        }

        scanner.close();
    }
}
