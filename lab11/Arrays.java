//Daniel Reilly
//4/23/15
//CSE002 lab11
//Program performs linear and binary search on large arrays of 
//random numbers

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner(System.in);
        int[] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)((Math.random() * 102) - 1);
        }
        printList(array1);
        System.out.println(" ");
        linearSearch(array1);
        int target = 0;
        System.out.println("Enter an int:");
        while (true) {
            if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                System.out.println("Invalid input, integers only");
                String wrong = myScanner.next();
                System.exit(1);
            }
            int number = myScanner.nextInt();
            if (number >= 0) { //if input is positive contiues to next input
                target = number;
                break;
            }
            else {
                System.out.println("Invalid input, postive numbers only");
                System.exit(1);
            }
        }

        int[] array2 = new int[50];
        int number = 0;
        for (int i = 0; i < array2.length; i++) {
            number += (int)((Math.random() * 102) - 1);
            array2[i] = number;
        }
        printList(array2);
        System.out.println(" ");
        int[] resultArray = binarySearch(array2, target);
        if (resultArray[2] == 0) {
            System.out.println(array2[resultArray[0]] + " was found");
            
        }
        //if result was not found it prints
        else {
            System.out.println(target + " was not found");
            System.out.println("The number below the key "+ array2[resultArray[0] - 1]);
        }   System.out.println("The number above the key "+ array2[resultArray[0]]);

    }

    public static void printList(int[] list) {

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void linearSearch(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {

                max = array[i];
            }
            else if (array[i] <= min) {

                min = array[i];
            }
        }
        System.out.println("The maximum of Array 1: " + max);
        System.out.println("The miniimum of Array 1: " + min);
    }

    public static int[] binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int counter = 0;
        int[] binarySearchArray = {-1, 0, 1};
        while (high >= low) {
            binarySearchArray[1] ++;
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
                binarySearchArray[0] = mid;
            }
            else if (key == list[mid]) {
                binarySearchArray[0] = mid;
                binarySearchArray[2] = 0;
                return binarySearchArray;
            }
            else {
                low = mid + 1;
            }
        }
        return binarySearchArray;

    }

}