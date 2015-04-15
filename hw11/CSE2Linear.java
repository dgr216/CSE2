//Daniel Reilly
//4/14/15
//CSE002 hw11
//Fun with Searching Program
//Has user enter grades. Prompts user to search the grades. Uses a binary search.
//

import java.util.Random;
import java.util.Scanner;

public class CSE2Linear {
    public static void main(String[] args) {
        
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
        int number = 1;
        int [] numberArray = new int [15];
        System.out.println( "Enter 15 students grades:");
        //This while loop and for loop check the user input under the HW criteria 
        while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Invalid input, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                if (number >= 0 && number < 101) { //if input is between 1 and 100 contiues to next input
                    numberArray[0]=number;
                    break;
                }
                else {
                    System.out.println("Invalid input, enter again");
                    continue;
                }
            }
        for(int i=1; i<15;){   
            while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Invalid input, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                if (number >= numberArray[i - 1] && number < 101) { //checks input is greater than previous input
                    numberArray[i]=number;
                    i++;
                    break;
                }
                else {
                    System.out.println("Invalid input, enter again");//if not prompt user to re-enter
                    continue;
                }
            }
        }
        System.out.print("The Grades sorted, are: ");
        printList(numberArray); //Prints the sorted array
        System.out.println(" ");
        System.out.println("Enter a grade to search for:");
        int number2 = 0;
        //Loop ensures user input is correct
        while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Invalid input, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number2 = myScanner.nextInt();
                if (number >= 0 && number < 101) { //if input is between 1 and 100 contiues 
                    break;
                }
                else {
                    System.out.println("Invalid input, enter again");
                    continue;
                }
            }
        int[] resultArray = binarySearch(numberArray, number2);//Runs array through search method 
        //if result is found prints
        if(resultArray[0]!=-1){
            System.out.println(numberArray[resultArray[0]] + " was found with " + resultArray[1] +" iterations");
        }
        //if result was not found it prints
        else{
            System.out.println(number2 + " was not found with " + resultArray[1] +" iterations" );
        }
        //Shuffles Arrays
        shuffleArray(numberArray);
        int[] scrambledArray = numberArray;
        printList(scrambledArray);
        System.out.println(" ");
        System.out.println("Enter a grade to search for:");
        int number3 = 0;
        while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Invalid input, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number3 = myScanner.nextInt();
                if (number >= 0 && number < 101) { //if input is between 1 and 100 contiues to pyramid
                    break;
                }
                else {
                    System.out.println("Invalid input, enter again");
                    continue;
                }
            }
        int linearResult = linearSearch(scrambledArray,number3); 
        linearResult++;
        if(linearResult>0){
            System.out.println(number3 + " was found with " + linearResult + " iterations");
        }
        else{
            System.out.println(number3 + " was found with " + scrambledArray.length + " iterations");
        }
        
        
        
    }
    
    //Mehthods prints Arrays
    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i]+ " ");
    }
    //Linear Search Method
    //Sreachs array one at a time and returns the postion if key is found
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
    
    //binary search method
    public static int[] binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int counter = 0;
        int[] binarySearchArray = {-1,0};
        while (high >= low) {
            binarySearchArray[1]++;
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                binarySearchArray[0] = mid;
                return binarySearchArray;
            }
            else {
                low = mid + 1;
            }
        }
        return binarySearchArray;

    }

    //Shuffle Array - Similar to sorting but with a random index
    public static void shuffleArray(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
} 