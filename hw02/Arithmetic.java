//Daniel Reilly
//2/3/15
//CSE002 hw02
//Arithmetic Java Program
//Computes the cost of items purchased including PA Sales text

//define a class
public class Arithmetic{
    
    //add a main method
    public static void main(String[] args){
        
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks
        //(‘$’ is part of the variable name)
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        double taxPercent=0.06; //PA Sales Tax percent
        double costOfSocks=nSocks*sockCost$; //Cost of Socks
        double sockSalesTax=costOfSocks*taxPercent; //Sales tax of socks
        sockSalesTax=(int)(sockSalesTax*100);
        double costOfGlasses=nGlasses*glassCost$; //Cost of Glasses
        double glassSalesTax=costOfGlasses*taxPercent; //Sales tax of glasses
        glassSalesTax=(int)(glassSalesTax*100);
        double costOfEnvelopes=nEnvelopes*envelopeCost$;//Cost of Envelopes
        double envelopeSalesTax=costOfEnvelopes*taxPercent; //Sales tax of Envelopes
        envelopeSalesTax=(int)(envelopeSalesTax*100);
        
        //Prints out the cost for each item and sales tax for each cost
        System.out.println(" 3 pairs of socks cost $"+
       	     (costOfSocks)+" plus the sales tax of $"+
       	      (sockSalesTax/100));
        System.out.println(" 6 glasses cost $"+
       	     (costOfGlasses)+" plus the sales tax of $"+
       	      (glassSalesTax/100));
        System.out.println(" 1 Envelope cost $"+
       	     (costOfEnvelopes)+" plus the sales tax of $"+
       	      (envelopeSalesTax/100));
        //Calculates and prints the total cost of purchases before tax
        double totalCost=costOfSocks+costOfGlasses+costOfEnvelopes;
        System.out.println(" The Total Cost is $"+
       	     (totalCost));
        //Calculates and prints the total cost of purchases with tax
       double totalPaid=totalCost+(totalCost*taxPercent);
       totalPaid=(int)(totalPaid*100);
       System.out.println(" The Total Amount Paid is $"+
       	     (totalPaid/100));
       	      
    }
}
        