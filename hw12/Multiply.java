//Daniel Reilly
//4/21/15
//CSE002 hw12
//Matrix Multiplication 
//This porgram implements matrix multiplication on random matrixs 

import java.util.Random;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner( System.in );
        //Declare input values
        int number = 1;
        int columnOne = 0;
        int columnTwo = 0;
        int widthOne = 0;
        int widthTwo = 0;
        
        //Prompts user to enter width and height for matrix one
        //Checks to ensure inputs is a postive integer and prompts user to renenter if not
        System.out.println("Enter Height for Matrix One");
        while (true) {
            if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                System.out.println("Invalid input, enter integers only");
                String wrong = myScanner.next();
                continue;
            }
            number = myScanner.nextInt();
            if (number > 0) { //if input is positive contiues to next input
                columnOne = number;
                break;
            }
            else {
                System.out.println("Invalid input, enter a postive number");
                continue;
            }
        }
        System.out.println("Enter Width for Matrix One");
        while (true) {
            if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                System.out.println("Invalid input, enter integers only");
                String wrong = myScanner.next();
                continue;
            }
            number = myScanner.nextInt();
            if (number > 0) { //if input is positive contiues to next input
                widthOne = number;
                break;
            }
            else {
                System.out.println("Invalid input, enter a number positve number");
                continue;
            }
        }
        int [][] matrixOne = randomMatrix(columnOne,widthOne);
        
        //Prompts user to enter width and height for matrix otwo
        //Checks to ensure inputs is a postive integer and prompts user to renenter if not
        System.out.println("Enter Height for Matrix Two");
        while (true) {
            if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                System.out.println("Invalid input, enter integers only");
                String wrong = myScanner.next();
                continue;
            }
            number = myScanner.nextInt();
            if (number > 0) { //if input is between is postive contiues to next input
                columnTwo = number;
                break;
            }
            else {
                System.out.println("Invalid input, enter postive numbers only");
                continue;
            }
        }
        System.out.println("Enter Width for Matrix Two");
        while (true) {
            if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                System.out.println("Invalid input, enter integers only");
                String wrong = myScanner.next();
                continue;
            }
            number = myScanner.nextInt();
            if (number > 0) { //if input is positive contiues to next input
                widthTwo = number;
                break;
            }
            else {
                System.out.println("Invalid input, enter postive integers only");
                continue;
            }
        }
        int [][] matrixTwo = randomMatrix(columnTwo, widthTwo);
        //Prints out matrix one and matrix two
        System.out.println("Matrix One is:");
        printMatrix(matrixOne);
        System.out.println("Matrix Two is:");
        printMatrix(matrixTwo);
        //Multiplies Matrix one and two
        int [][] productMatrix = matrixMultiply(matrixOne, matrixTwo);
        //if matrix one and two can't be multiplied error message is returned
        while(true){
        if(productMatrix == null){
            System.out.println("Matrix One and Matrix Two can't multiplied due to size");
            break;
        }
        //Prints out product of the multiplication
        else{System.out.println("The product of Matrix One and Matrix Two is:");
        printMatrix(productMatrix);
        break;}
        }
    }
    
    //Method generates random numbers for a matrix of given size input by the user
    public static int[][] randomMatrix(int width, int height) {
        int [][] matrix = new int [width][height];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)((Math.random() * 22) - 11); //inputs a random number from -10 to 10
            }
        }
        return matrix;
    }

    //Prints Matrix 
    public static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    //Multiplies to Two matrixes together and checks to see if the size is compatible to multiply 
    public static int[][] matrixMultiply(int[][] matrixOne, int[][] matrixTwo) {
        int mRRowLength = matrixOne.length;    // mResult rows length
        int mRColLength = matrixTwo[0].length;
        int [][] mResult = new int[mRRowLength][mRColLength];
        if (matrixOne[0].length != matrixTwo.length) {
            return null;
        }
        for (int i = 0; i < matrixOne.length; i++) { // rows from matrixOne
            for (int j = 0; j < matrixTwo[0].length; j++) { // columns from matrixTwo
                for (int k = 0; k < matrixOne[0].length; k++) { // columns from matrixOne
                    mResult[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }
        return mResult;
    }

}