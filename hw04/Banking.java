//Daniel Reilly
//2/17/15
//CSE002 hw04
//Banking Java Program
//Allows users to process banking transactions

import java.util.Scanner;
import java.util.Random;

public class Banking {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        Random rand = new Random();
        float balance =(float) rand.nextInt(4000) + 1000; //generates a random balance for the user
        System.out.print("Would you like to deposit, withdraw or veiw balance?\nPress 1 to Deposit\nPress 2 to Withdraw\nPress 3 to view Balance " );
        int input = myScanner.nextInt();
        switch(input){          //switch statement to get obtain wether the user wants to withdraw, deposit, or veiw balance
            case 1:
                System.out.println("How much would you like to deposit?");  
                double deposit = myScanner.nextDouble();
                if(deposit>=0){  //if statement to ensure input is positve
                    double total=balance + deposit; //generates new balance after deposit
                    System.out.printf("Your new balance is %.2f \n",total); 
                 }
                 else if (deposit < 0){
                     System.out.println("Please enter a postive number"); //Prompts the user enter a positive number
                 }
                 else{
                     System.out.println("Please enter numbers only");
                 }
            break;
            case 2:
                System.out.println("How much would you like to withdraw?"); //Prompts user to enter how much they want to withdraw
                double withdraw = myScanner.nextDouble();
                if(withdraw>0){
                    double withdrawBalance = balance - withdraw; 
                    if(withdrawBalance>=0){ //if statement to ensure the user has enough money in the account
                        System.out.printf("Your new balance is %.2f \n",withdrawBalance);
                    }
                    else{
                        System.out.printf("You don't have enough money in your account \n");
                    }
                }
                break;
                
            case 3:
                System.out.printf("Your Balance is %.2f \n",balance); //Displays the balance of the user
                break;
            default:
                System.out.println("Your Entry is invalid");
                break;
        }
    }
}
