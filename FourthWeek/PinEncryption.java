import java.util.Random;
import java.util.Scanner;

public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter a 4-digit pin number
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        // Convert the pin number to hexadecimal
        String hexPin = Integer.toHexString(pin);

        // Generate two random numbers greater than 1000 and less than 65536
        int randomNum1 = random.nextInt(64536) + 1000;  // Generates a number between 1000 and 65536
        int randomNum2 = random.nextInt(64536) + 1000;  // Generates a number between 1000 and 65536

        // Convert the random numbers to hexadecimal
        String hexRandom1 = Integer.toHexString(randomNum1);
        String hexRandom2 = Integer.toHexString(randomNum2);

        // Encrypt the pin by sandwiching the converted pin between the two random hex numbers
        String encryptedPin = hexRandom1 + hexPin + hexRandom2;

        // Output the encrypted pin
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }
}
