//Daniel Reilly
//3/2/15
//CSE002 hw06
//Input an integer that is between 9 and 16 inclusively. 
//Then program calculates the factorial of the input number.

import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
    System.out.println("Please enter an integer between 9 and 16 inclusively");  //prompts user to enter an integer between 9 and 16
    int i=1;
    int anwser = 1;
    int factorial =1;
    while(true){
    if (myScanner.hasNextInt() != true){    //if input is not a int prompts user to reenter 
        System.out.println("Invalid input, enter again");
        String wrong = myScanner.next();
        continue;
        }
    factorial = myScanner.nextInt();
    if(factorial>8 && factorial<17){         //if input is between 9 and 16 contiues to factorial calc
        break;
    }
    else{
        System.out.println("Invalid input, enter again");
        continue;
    }
    }
    while (i<=factorial){  //calculates factorial value
    anwser *= i;                       
    i++;
    }
    System.out.println("Input accepted");    //Prints anwser 
    System.out.println(factorial+"!:"+anwser);
    }
}
