import java.util.Scanner;

public class KmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input;
        double miles = 1.60935;
        double kilometers;

        System.out.println("Convert Miles To Kilometers");
        System.out.print("Please enter the miles: ");
        input = scanner.nextDouble();

        kilometers = input * miles;

        System.out.printf("%f Miles to kilometer is %f \n", input , kilometers);
        scanner.close();
    }

}
