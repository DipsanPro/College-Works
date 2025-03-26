import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";
        String reverse = "";
        char ch;
        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();
        for(int i = 0 ; i < sentence.length() ; i++) {
            ch = sentence.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("The reversed string is: "+reverse);
    }
}
