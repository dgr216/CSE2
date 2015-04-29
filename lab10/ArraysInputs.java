//Daniel Reilly
//4/23/15
//CSE002 lab10
//Has user input arrays


import java.util.Scanner;

public class ArraysInputs {
    public static void main(String[] args) {
    Scanner myScanner; //Declare the Scanner
    myScanner = new Scanner(System.in);
    System.out.println("Please enter size of the array:");
    int size = myScanner.nextInt();
    int [] resultArray = input(size);
    System.out.println("The array is:");
    printList(resultArray);
    System.out.println(" ");
    }
    
    public static int [] input(int size){
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner(System.in);
        int number = 1;
        int [] numberArray = new int [size];   
        System.out.println("Please enter " +size+" positive integer");
        for(int i=0; i<size;){   
            while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Please enter integers only, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                if (number >= 0) { //checks input is greater than previous input
                    numberArray[i]=number;
                    i++;
                    break;
                }
                else {
                    System.out.println("Please enter positive numbers only, enter again");//if not prompt user to re-enter
                    continue;
                }
            }
        }
        return numberArray;
    }
    
    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i]+ " ");
    }
}