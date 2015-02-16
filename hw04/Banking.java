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
        float balance =(float) rand.nextInt(4000) + 1000;
        System.out.println(balance);
        System.out.print("Would you like to deposit, withdraw or veiw balance?\nPress 1 to Deposit\nPress 2 to Withdraw\nPress 3 to view Balance " );
        int input = myScanner.nextInt();
        switch(input){
            case 1:
                System.out.println("How much would you like to deposit?");
                double deposit = myScanner.nextDouble();
                if(deposit>=0){
                    double total=balance + deposit;
                    System.out.printf("Your new balance is %.2f \n",total);
                 }
                 else if (deposit < 0){
                     System.out.println("Please enter a postive number");
                 }
                 else{
                     System.out.println("Please enter numbers only");
                 }
            break;
            case 2:
                System.out.println("How much would you like to withdraw?");
                double withdraw = myScanner.nextDouble();
                if(withdraw>0){
                    double withdrawBalance = balance - withdraw;
                    if(withdrawBalance>=0){
                        System.out.printf("Your new balance is %.2f \n",withdrawBalance);
                    }
                    else{
                        System.out.printf("You don't have enough money in your accout \n");
                    }
                }
                break;
                
            case 3:
                System.out.printf("Your Balance is %.2f \n",balance);
                break;
            default:
                System.out.println("Your Entry is invalid");
                break;
        }
    }
}
