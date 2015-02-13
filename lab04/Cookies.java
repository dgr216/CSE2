//Daniel Reilly
//2/13/15
//CSE002 lab04
//Cookies Java Program
//Progam uses the Scanner class to obtain from users 
//how many cookies they want, how many people they 
//are buying for, and at least how many cookies they want 
//each person to get.

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        System.out.print( "Enter the number of people:"); //Prompts user to enter a double 
        if(myScanner.hasNextInt()){
            int people = myScanner.nextInt();
            if(people>0){
                System.out.print("Enter the number of cookies you are planning to buy:");
                if(myScanner.hasNextInt()){
                    int cookies = myScanner.nextInt();
                    if(cookies>0){
                        System.out.print("How many cookies do you want each person to get:");    
                        int cookiesReceived=myScanner.nextInt();
                        if(cookiesReceived>0){
                        int result=cookies-(people*cookiesReceived);
                            if(result>=0){
                                int remainder=cookies % cookiesReceived;
                                if(remainder==0){
                                    System.out.println("You have enough cookies and it will divide evenly");
                                }
                                else{
                                    System.out.println("You have enough cookies but it will not divide evenly");
                                }
                            }
                            else{
                                int positiveResult=Math.abs(result);
                                System.out.println("You do not have enough cookies and you need "+positiveResult+" more");
                                return;    //leaves the program 
                            }
                        }
                        else{
                            System.out.println("You did not enter an int > 0");
                            return;    //leaves the program
                        }    
                    }
                     else{
                    System.out.println("You did not enter an int > 0");
                    return;    //leaves the program
                     }
                }      
                else{
                    System.out.println("You did not enter an int");
                    return;    //leaves the program
                }
            }
            else{
                System.out.println("You did not enter an int > 0");
                return;
            }
        }   
        else{
        System.out.println("You did not enter an int");
        return;    //leaves the program
                  }

        
    }
}