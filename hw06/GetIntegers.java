//Daniel Reilly
//3/2/15
//CSE002 hw06
//Get Integers Program
//Ask the user for 5 non-negative integers 
//(if an invalid value is entered, then ask again, using a loop), and 
//print out the sum of the 5 integers

import java.util.Scanner;

public class GetIntegers {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
        System.out.println("Please enter 5 non-negative integers:"); //Prompts the user to enter 5 integers 
        int sum = 0;                            //sets sum=0
        for(int k=0; k<5;k++) {                 //for loop that prompts user to enter five integers
            if (myScanner.hasNextInt() != true){   //if input is not a int prompts user to reenter 
            System.out.println("Invalid input, enter again");
            String wrong = myScanner.next();
            k--;
            continue;
            }
            int numb = myScanner.nextInt();
            if (numb<0){                //if integer is negative prompts user to re-enter a number 
                System.out.println("Invalid input, enter again");
                k--;
            continue;
            }
            sum += numb; //Sum of all the inputs
        }
        System.out.println("Sum is "+sum);   //prints the sum
    }
}