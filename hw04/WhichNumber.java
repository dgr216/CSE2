//Daniel Reilly
//2/17/15
//CSE002 hw04
//Which Number Java Program
//Guess a Number and the program proceeds to ask the user questions 
//in an attempt to guess what number the user is thinking of

import java.util.Scanner;

public class WhichNumber {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        System.out.println( "Guess an integer between 1-10");
        System.out.print( "Is the number even? ");
        char even=myScanner.next().charAt(0);
        char Y;
        char y;
        char N;
        char n;
        //Switch to see if the number is even
        switch(even){
            case 'Y'|'y':
                System.out.print( "Is the number divisble by 3? "); //Switch to see if the number is divisble by 3
                char divbythree=myScanner.next().charAt(0);
                switch(divbythree){
                case 'Y'|'y':
                    System.out.print( "Is the number 6? "); //switch statement to see if the number is 6
                    char six=myScanner.next().charAt(0);
                    switch(six){
                        case 'Y'|'y':                   
                        System.out.println("Yay");                      //Standard Switch statement to see if the number guess is correct
                        break;                  
                        case 'N'|'n':
                        System.out.println("Oh no");
                        break;
                        default:
                        System.out.println("Please enter Y or N only"); //prompts the user to only enter Y or N
                        break;
                    }
                    break;
                case 'N'|'n':
                    System.out.print( "Is the divisble by 4? ");  
                    char divbyfour=myScanner.next().charAt(0); //Prompts the user if the number is divisble by four
                    switch(divbyfour){
                        case 'Y'|'y':
                        System.out.print( "Is the number divided by four greater than 1?"); //switch statement to see is divided by 4 if its greater than 1
                        char fourGreaterThanOne=myScanner.next().charAt(0);
                        switch(fourGreaterThanOne){
                            case 'Y'|'y':
                            System.out.print("Is your Number 8? "); //switch statement to see if the number is 8
                            char eight=myScanner.next().charAt(0);
                            switch(eight){
                                case 'Y'|'y':
                                System.out.println("Yay");
                                break;
                                case 'N'|'n':
                                System.out.println("Oh no");
                                break;
                                default:
                                System.out.println("Please enter Y or N only");
                                break;
                            }
                            break;
                            case 'N'|'n':
                            System.out.print( "Is the number 4? "); //switch statement to see if the number is 4
                            char four=myScanner.next().charAt(0);
                                switch(four){
                                    case 'Y'|'y':
                                    System.out.println("Yay");
                                    break;
                                    case 'N'|'n':
                                    System.out.println("Oh no");
                                    break;
                                    default:
                                    System.out.println("Please enter Y or N only");
                                    break;
                                }
                            break;
                            default:
                            System.out.println("Please enter Y or N only");
                            break;
                        }
                        break;
                        case 'N'|'n':
                        System.out.print("Is it divisible by 5? "); //switch statement to see if it is divisible 5
                        char divbyfive=myScanner.next().charAt(0);
                        switch(divbyfive){
                            case 'Y'|'y':
                            System.out.print("Is your Number 10? "); //switch statement to see if the number is 10
                            char eight=myScanner.next().charAt(0);
                            switch(eight){
                                case 'Y'|'y':
                                System.out.println("Yay");
                                break;
                                case 'N'|'n':
                                System.out.println("Oh no");
                                break;
                                default:
                                System.out.println("Please enter Y or N only");
                                break;
                            }
                            break;
                            case 'N'|'n':
                            System.out.print( "Is the number 2? "); //switch statement to see if the number is 2
                            char four=myScanner.next().charAt(0);
                                switch(four){
                                    case 'Y'|'y':
                                    System.out.println("Yay");
                                    break;
                                    case 'N'|'n':
                                    System.out.println("Oh no");
                                    break;
                                    default:
                                    System.out.println("Please enter Y or N only");
                                    break;
                                }
                            break;
                            default:
                            System.out.println("Please enter Y or N only");
                            break;
                        }
                        break;
                        default:
                        System.out.println("Please enter Y or N only");
                        break;
                        }
                break;
            
                default:
                System.out.println("Please enter Y or N only? ");
                break; 
                  }
            break;
            
            case 'N'|'n':
            
            System.out.print( "Is the number divisble by 3? "); //switch statement to see if the number is divisble by 3
                char divbythree2=myScanner.next().charAt(0);
                switch(divbythree2){
                case 'Y'|'y':
                    System.out.print( "When Divided by 3 is the result great than 1? "); //switch statement to see if when the number is divided by 3 its greater than 1
                    char divByThreeGreaterThanOne=myScanner.next().charAt(0);
                    switch(divByThreeGreaterThanOne){
                        case 'Y'|'y':
                        System.out.print("Is your Number 9? "); //switch statement to see if the number is 9
                        char nine=myScanner.next().charAt(0);
                            switch(nine){
                                case 'Y'|'y':
                                System.out.println("Yay");
                                break;
                                case 'N'|'n':
                                System.out.println("Oh no");
                                break;
                                default:
                                System.out.println("Please enter Y or N only");
                                break;
                            }
                        break;
                        case 'N'|'n':
                        System.out.print("Is your Number 3? "); //switch statement to see if the number is 3
                        char three=myScanner.next().charAt(0);
                            switch(three){
                                case 'Y'|'y':
                                System.out.println("Yay");
                                break;
                                case 'N'|'n':
                                System.out.println("Oh no");
                                break;
                                default:
                                System.out.println("Please enter Y or N only");
                                break;
                            }
                        break;
                        default:
                        System.out.println("Please enter Y or N only");
                        break;
                    }
                break;    
                case 'N'|'n':
                    System.out.print( "Is it greater than 6? ");  //switch statement to see if the number is greater than 6
                    char greaterThanSix=myScanner.next().charAt(0);
                    switch(greaterThanSix){
                        case 'Y'|'y':
                            System.out.print("Is your Number 7? "); //switch statement to see if the number is 7
                            char seven=myScanner.next().charAt(0);
                            switch(seven){
                                case 'Y'|'y':
                                System.out.println("Yay");
                                break;
                                case 'N'|'n':
                                System.out.println("Oh no");
                                break;
                                default:
                                System.out.println("Please enter Y or N only");
                                break;
                            }
                        break;    
                        case 'N'|'n':
                            System.out.print( "Is it less than 3? "); //switch statement to see if the number is less than 3
                            char lessThanThree=myScanner.next().charAt(0);
                                switch(lessThanThree){
                                    case 'Y'|'y':
                                    System.out.print("Is your number 1? "); //switch statement to see if the number is 1
                                    char one=myScanner.next().charAt(0);
                                        switch(one){
                                        case 'Y'|'y':
                                        System.out.println("Yay");
                                        break;
                                        case 'N'|'n':
                                        System.out.println("Oh no");
                                        break;
                                        default:
                                        System.out.println("Please enter Y or N only");
                                        break;
                                        }
                                    break;
                                    case 'N'|'n':
                                    System.out.print("Is your Number 5? "); //switch statement to see if the number is 5
                                    char five=myScanner.next().charAt(0);
                                        switch(five){
                                        case 'Y'|'y':
                                        System.out.println("Yay");
                                        break;
                                        case 'N'|'n':
                                        System.out.println("Oh no");
                                        break;
                                        default:
                                        System.out.println("Please enter Y or N only");
                                        break;
                                        }
                                    break;
                                    default:
                                    System.out.println("Please enter Y or N only");
                                    break;
                                }
                        break;
                            default:
                            System.out.println("Please enter Y or N only");
                            break;
                        }
                        break;
                }
            break;    
            default:
            System.out.println("Please enter Y or N only"); //Prompts user to only enter Y or N
            break;
        }
      
    }
}
