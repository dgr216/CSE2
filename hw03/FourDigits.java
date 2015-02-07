//Daniel Reilly
//2/6/15
//CSE002 hw03
//Four Digit Java Program
//Prompts the user to enter a double and  
//then prints out the first four digits to the 
//right of the decimal point.

import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        System.out.print( "Enter a double and I print the first four digits to the right of the decimal point:"); //Prompts user to enter a double
        double inputValue = myScanner.nextDouble();
        int leftDigits=(int)(inputValue*10000); //Multiplys the input by 10000 and converts it to int
        int fourDigits=leftDigits % 10000; //Take remainder so only the last 4 digits are left
        System.out.printf("The four digits are %04d %n",fourDigits); //Prints out the first four digits to the right so there is always four decimal spots

    }
}