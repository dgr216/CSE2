//Daniel Reilly
//3/617/15
//CSE002 hw07
//Write a program that forces the user to enter an integer 
//between 1 and 30, inclusive, and then prints out displays 
//that depend on the value entered


import java.util.Scanner;

public class waves {
    public static void main(String[] args) {
        
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
        
        int number =1;
        System.out.println( "Enter an  integer between 1 and 30:"); //prompts user to input between 1 and 30
        while(true){       
        if (myScanner.hasNextInt() != true){    //if input is not a int prompts user to reenter 
            System.out.println("Invalid input, enter again");
            String wrong = myScanner.next();
            continue;
        }
            number = myScanner.nextInt();
        if(number>0 && number<31){         //if input is between 1 and 30 contiues to pyramid
            break;
        }
        else{
            System.out.println("Invalid input, enter again");
        continue;
        }
        }
        
        System.out.println("For Loop:");    //For Loop
        for(int count=1; count<=number; count++){    //This for loop keeps track of the number and makes the right number of pyramids
            
            for(int lineNumber=0; lineNumber<count; lineNumber++){ //This for loop keeps track of the number of lines per number
               if(count%2 == 0){        // if statement checks to see if the number is even or odd
                   for(int numberCounter=0; numberCounter<lineNumber+1; numberCounter++){  //This for loop keeps track of the number of numbers per line
                System.out.print(count);
                }
            System.out.println(""); //Once the correct number per line is reached is a new line is created
               }
            else{
            for(int oddNumbers = count; oddNumbers>lineNumber; oddNumbers--){ //for odd numbers it starts with the max number and decreases as it goes down the pyramid
                System.out.print(count);
            }
            System.out.println("");
            }    
            }    
        }
        System.out.println("While Loop:");
        //intalizing similar counters as above 
        int counter=0; 
        int linenumber = 0;
        int start = 1;
        int q=0;
        while (counter<number){ //while loop keeps track of the number of pyramids 
            if(start%2 == 0){    //checks to see if the number is even or odd
            while(q<linenumber){
                System.out.print(start);
                q++;
            }
            q=0;       //resets the counter number
            linenumber++;
            System.out.println("");
            if (linenumber == (start + 1)){ //once correct number is reached per line a new line is formed and the number count is reset
                start++;
                q=0;
                linenumber=0;
                counter++;
            }
            }
            else{ //if number is odd it decreases as lines increse 
            q=start;
            while(q>linenumber){
                System.out.print(start);
                q--;
            }
            q=start;
            linenumber++;
            System.out.println("");
            if (linenumber == start){
                start++;
                q=0;
                linenumber=1;
                counter++;
            }    
            }
        }
        
    System.out.println("Do While Loop:");     //Similar to while loop 
        counter=0;
        linenumber = 0;
        q=0;
        start = 1;
    do{
            if(start%2 == 0){
            do{System.out.print(start);
                q++;
            }while(q<linenumber);
            q=0;
            linenumber++;
            System.out.println("");
            if (linenumber == (start + 1)){
                start++;
                q=0;
                linenumber=0;
                counter++;
            }
            }
            else{
            q=start;
            do{System.out.print(start);
                q--;
            }while(q>linenumber);
            q=start;
            linenumber++;
            System.out.println("");
            if (linenumber == start){
                start++;
                q=0;
                linenumber=1;
                counter++;
            }    
            }
        }while (counter<number); 

    }
}
    
