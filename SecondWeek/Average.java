// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        double val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;

        // get three values from user
        System.out.println("Please enter three integers and " + "I will compute their average");

        System.out.print("Please enter the first integer: ");
        val1 = scan.nextDouble();
        System.out.print("Please enter the second integer: ");
        val2 = scan.nextDouble();
        System.out.print("Please enter the third integer: ");
        val3 = scan.nextDouble();

        //compute the average

        average = (val1 + val2 + val3)/3;

        //print the average
        System.out.println("The average is: " + average);

    }
}