//Daniel Reilly
//2/6/15
//CSE002 hw03
//Bicycle Java Program
//Prompts the user to enter two digits, the first giving 
//the number of counts on a cyclometer and the second giving 
//the number of seconds during which the counts occurred, 
//and then an then prints out the distance traveled 
//and the average miles per hour.

import java.util.Scanner;

public class Bicycle {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in ); // Construct the scanner
        //Prompt the user to enter number of counts
        System.out.print( "Enter the number of counts:");
        int counts = myScanner.nextInt();
        //Prompts the user to enter the cost of the seconds
        System.out.print("Enter the number of seconds:");
        int seconds = myScanner.nextInt();
        double wheelDiameter=27.0;  //Diameter of the wheel
    	double PI=3.14159; //Pi for distance calculation
  	    double feetPerMile=5280;  //Conversion factor for distance calculation
  	    double inchesPerFoot=12; //Conversion factor for for distance calculation
  	    double secondsPerMinute=60; //Conversion factor for for distance calculation
  	    double minutesPerHour=60; //Conversion factor for for distance calculation
        double wheelDiameterMiles=wheelDiameter/inchesPerFoot/feetPerMile; //Converts wheel diameter to miles
        double distanceTrip1=counts*wheelDiameterMiles*PI; //gives distance in inches
        double minutes=seconds/secondsPerMinute; //converts the input seconds to minutes
        double speedTrip1=distanceTrip1/(seconds/secondsPerMinute/minutesPerHour); //calculates average mph
        //Prints distance, time, and mph with 2 decimal places       
        System.out.printf("The distance was %.2f miles",distanceTrip1); 
        System.out.printf(" and took %.2f minutes %n",minutes);
        System.out.printf("The average mph was %.2f %n",speedTrip1);
        
    
    }
}