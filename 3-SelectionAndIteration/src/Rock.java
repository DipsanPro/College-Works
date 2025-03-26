import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    // User's play -- "R", "P", or "S"
        String computerPlay = "";  // Computer's play -- "R", "P", or "S"
        int computerInt;      // Randomly generated number used to determine

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Get player's play -- note that this is stored as a string
        System.out.print("Enter your choice (R ,P or S): ");
        personPlay = scan.nextLine();

        computerInt = generator.nextInt(3) + 1;  // Generates a number between 1 and 3

        switch (computerInt)
        {
            case 1:
                computerPlay = "R";
                break;
            case 2:
                computerPlay = "P";
                break;
            case 3:
                computerPlay = "S";
                break;
        }

        // Print the result of the game
        System.out.println("Computer chose: " + computerPlay);

        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("IT IS A TIE, Computer choice was " + computerPlay);
        }
        else if (personPlay.equalsIgnoreCase("R")) {
            if (computerPlay.equalsIgnoreCase("P")) {
                System.out.println("You Lost, Computer choice was " + computerPlay);
            }
            else if (computerPlay.equalsIgnoreCase("S")) {
                System.out.println("You Won, Computer choice was " + computerPlay);
            }
        }
        else if (personPlay.equalsIgnoreCase("P")) {
            if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("You Won, Computer choice was " + computerPlay);
            }
            else if (computerPlay.equalsIgnoreCase("S")) {
                System.out.println("You Lost, Computer choice was " + computerPlay);
            }
        }
        else if (personPlay.equalsIgnoreCase("S")) {
            if (computerPlay.equalsIgnoreCase("P")) {
                System.out.println("You Won, Computer choice was " + computerPlay);
            }
            else if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("You Lost, Computer choice was " + computerPlay);
            }
        }
        else {
            System.out.println("Invalid input, please enter 'R', 'P', or 'S'");
        }
    }
}
