import java.util.Scanner;

public class SimpleHistogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ranges = new int[10];
        
        System.out.println("Enter numbers between 1 and 100 (enter 0 to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
            if (number == 0) {
                break; 
            }
            
            if (number < 1 || number > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue; 
            }
            
            int rangeIndex = (number - 1) / 10;
            ranges[rangeIndex]++;
        }
        
        System.out.println("\nHistogram:");
        for (int i = 0; i < ranges.length; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;
            
            String rangeLabel;
            if (start == 1) {
                rangeLabel = " 1 - 10";
            } else if (end == 100) {
                rangeLabel = "91 -100";
            } else {
                rangeLabel = start + "-" + end;
            }
            
            System.out.print(rangeLabel + " | ");
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
}