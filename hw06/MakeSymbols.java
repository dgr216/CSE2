//Daniel Reilly
//3/2/15
//CSE002 hw06
//generate an integer between 0 and 100. Program prints out the number.
//If the number is even, you will then print out that number of “*” characters; 
//if the number is odd, then you will print out that number of “&” characters.

public class MakeSymbols {
    public static void main(String[] args) {
        
       int number = (int)((Math.random())*100); 
       int check = number % 2;    //Determine if the number is odd or even
       int i=0;
       System.out.println("The Random Number Generated is: "+number); //Always prints the random number generated
       do{
       if(check == 0){
               System.out.print("*");  //Prints * if number is even
            }
        else{
               System.out.print("&"); //Prints & if number is odd
            }
        i++;  //increments i so the right number of symbols are printed
       }while(i<number);
            System.out.println(" ");
    }
}
        
           
