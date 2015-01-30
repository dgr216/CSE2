//Daniel Reilly
//1/30/15
//CSE002 lab02
//Cylcometer Java Program
//This program takes the data obtained from a cyclometer of two
//trips gives duration of trip, number of count, and distance

// What does MPG do?
//MPG is the average of miles a car gets on one gallon of gas
public class Cyclometer {
    
   	public static void main(String[] args) {
        int secsTrip1=480;  //duration of trip one in seconds
       	int secsTrip2=3220;  //duration of trip two in seconds
		int countsTrip1=1561;  //count of trip 1
		int countsTrip2=9037; //count of trip 2
		
        double wheelDiameter=27.0,  //Diameter of the wheel
    	PI=3.14159, //Pi for distance calculation
  	    feetPerMile=5280,  //Conversion factor for distance calculation
  	    inchesPerFoot=12,   //Conversion factor for for distance calculation
  	    secondsPerMinute=60;  //Conversion factor for for distance calculation
	    double distanceTrip1, distanceTrip2,totalDistance;  //
	    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");

        //These Calculations will give the distance for trip 1 and trip 2 and total distance
		//It will then convert the distance from inches to miles
	    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; //Adds distance of both trips together
       //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");


	}     
} 
