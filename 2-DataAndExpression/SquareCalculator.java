import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length of the square's side: ");
        int side = scanner.nextInt();

        // Calculate perimeter and area
        int perimeter = 4 * side;
        int area = side * side;

        // Display the results
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);

        scanner.close();
    }
}
