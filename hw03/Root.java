//Daniel Reilly
//2/6/15
//CSE002 hw03
//Root Java Program
//Prompts the user to enter a double and then prints out a 
//crude estimate of the cube root of the number and the value 
//of this crude guess when cubed

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        System.out.print( "Enter a double and I print its cube root:"); //Prompts user to enter a double
        double inputValue = myScanner.nextDouble();
        double guess=inputValue/3; //First guess
        double guess2=(2*guess*guess*guess+inputValue)/(3*guess*guess); //improves guess 
        double guess3=(2*guess2*guess2*guess2+inputValue)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+inputValue)/(3*guess3*guess3);
        double guess5=(2*guess4*guess4*guess4+inputValue)/(3*guess4*guess4);
        double guess6=(2*guess5*guess5*guess5+inputValue)/(3*guess5*guess5);
        System.out.println("The cube root is "+guess6); //Prints the programs estimate
        System.out.println("The cube of the estimate is "+guess6*guess6*guess6); //Prints the cube of the estimate 
        
    }
    
}

        