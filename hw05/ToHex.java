//Daniel Reilly
//2/24/15
//CSE002 hw05
//To Hex Program
//develop a program which takes decimal RGB values 
//(three inputs) and convert them to hexadecimal

import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
        System.out.println("Please enter three numbers representing RGB values:"); //Prompts the user to enter RGB values
        if (myScanner.hasNextInt() != true){
            System.out.println("Please enter intgers only");
            System.exit(1);
        }
        int redBase10 = myScanner.nextInt(); //Using a scanner obtain the input values for red, green and blue
        if (myScanner.hasNextInt() != true){
            System.out.println("Please enter intgers only");
            System.exit(1);
        }
        int greenBase10 = myScanner.nextInt(); 
        if (myScanner.hasNextInt() != true){
            System.out.println("Please enter intgers only");
            System.exit(1);
        }
        int blueBase10 = myScanner.nextInt();
        
        //Converts the red input to hexadecimal by dividing it by 16 and finding the remainder
        int redFirstDigit = redBase10/16;
        int redSecondDigit = redBase10 % 16;
        int greenFirstDigit = greenBase10/16;
        int greenSecondDigit = greenBase10 % 16;
        int blueFirstDigit = blueBase10/16;
        int blueSecondDigit = blueBase10 % 16;
        
        if (redBase10<=255 && redBase10>=0 && greenBase10<=255 && greenBase10>=0 && blueBase10<=255 && blueBase10>=0){
            System.out.print("The decimal numbers R: "+redBase10+", G: "+greenBase10+", B: "+blueBase10+" is represented in hexadecimal as: ");
            switch(redFirstDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(redFirstDigit);
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
            }
            switch(redSecondDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(redSecondDigit);
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
            }
            switch(greenFirstDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(greenFirstDigit);
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
            }
            switch(greenSecondDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(greenSecondDigit);
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
            }
            switch(blueFirstDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(blueFirstDigit);
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
            }
            switch(blueSecondDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(blueSecondDigit);
                    break;
                case 10:
                    System.out.println("A");
                    break;
                case 11:
                    System.out.println("B");
                    break;
                case 12:
                    System.out.println("C");
                    break;
                case 13:
                    System.out.println("D");
                    break;
                case 14:
                    System.out.println("E");
                    break;
                case 15:
                    System.out.println("F");
                    break;
            }
            
        }
        else{
            System.out.println("Please enter a number between 0 and 255");
        }
    }
}