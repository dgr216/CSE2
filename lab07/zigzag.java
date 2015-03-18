//Daniel Reilly
//3/6/15
//CSE002 lab07
//

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
    
        int nStars = 10;
        int counter = 0;
        while (counter<nStars){
            System.out.print("*");
            counter++;
        }
        
        System.out.println(" ");
        
        counter=0;
        int linenumber = 0;
        int q=1;
        while (counter<nStars){
            while(q<linenumber){
                System.out.print(" ");
                q++;
            }
            linenumber++;
            q=0;
            System.out.println("*");
            counter++;
        }
        int nStarts = 10;
        counter = 0;
        while (counter<nStars){
            System.out.print("*");
            counter++;
        }
        
        System.out.println(" ");
      
    Scanner myScanner; //Declare the Scanner
    myScanner = new Scanner( System.in );
    while(true){
    
    int nStars2 = 1;
        while (nStars2 < 3 || nStars2 > 33){
            System.out.println("Enter an integer between 3 and 33:");
            
            while(myScanner.hasNextInt() != true){
                System.out.println("Invalid input, enter again");
                String wrong = myScanner.next();
                System.out.println("Enter an integer between 3 and 33:");
                if(myScanner.hasNextInt() == true){
                    break;
                }
            }
            nStars2=myScanner.nextInt();
            if(nStars2>2 && nStars2<34){
                break;
            }
            else{
                System.out.println("The Number is out of range");
                continue;
            }
        }
        
       counter=0; 
       while (counter<nStars2){
            System.out.print("*");
            counter++;
        }
        
        System.out.println(" ");
        
        counter=0;
        linenumber = 0;
        q=1;
        while (counter<nStars2){
            while(q<linenumber){
                System.out.print(" ");
                q++;
            }
            linenumber++;
            q=0;
            System.out.println("*");
            counter++;
        }
        int nStarts2 = nStars2;
        counter = 0;
        while (counter<nStarts2){
            System.out.print("*");
            counter++;
        }
        
        System.out.println(" "); 
    System.out.println("Enter y or Y to go again:"); 
    
    char yes=myScanner.next().charAt(0);
    char Y;
    char y;
    switch(yes){ 
    case 'Y' | 'y':    
        continue;
    }
    break;
        
    }    
    
      
        
    }
}
