//Daniel Reilly
//4/28/15
//CSE002 hw13
//Creates a ragged 4D array containing random doubles between 0 and 30 
//Accepts user input for the min and max of each array

import java.util.Scanner;
import java.util.Random;

public class FourDwin {
    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int number = 0;
        System.out.println("Enter an X Intger:");
        while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Please enter integers only, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                if (number >= 0) { //checks input is greater than previous input
                    x=number;
                    break;
                }
                else {
                    System.out.println("Please enter positive numbers only, enter again");//if not prompt user to re-enter
                    continue;
                }
            }
         System.out.println("Enter an Y Intger:"); 
         while (true) {
                if (myScanner.hasNextInt() != true) { //if input is not a int prompts user to reenter 
                    System.out.println("Please enter integers only, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                if (number > x) { //checks input is greater than previous input
                    y=number;
                    break;
                }
                else {
                    System.out.println("Please enter number greater than x, enter again");//if not prompt user to re-enter
                    continue;
                }
            }
        double [][][][] matrix4D = randomArray(x,y);
        statArray(matrix4D);
        System.out.println("The orignal Array:");
        printArray(matrix4D);
        sort4DArray(matrix4D);
        System.out.println("The sorted Array:");
        printArray(matrix4D);
        
    }

    
    public static double[][][][] randomArray(int low, int high){
     double [][][][] matrix = new double [3][][][];
     Random rando = new Random();
     for (int i=0; i<3; i++){
             int randNum1= low+1+(int)(Math.random()*(high-low));
             matrix[i]=new double[randNum1][][];                   
             
             for (int j=0; j<matrix[i].length; j++){
                matrix[i][j]=new double[randNum1][];                            
             
                 for (int k=0; k<matrix[i][j].length; k++){
                     matrix[i][j][k]=new double[randNum1]; //                           
                     for (int l=0; l<matrix[i][j][k].length; l++){          
                        double g=rando.nextDouble()*30.0;
                     int num= (int) (g*10);
                     double num2=(num/10.0); 
                     
                     
                     matrix[i][j][k][l]=num2; 
                     }
                     
                 }
             }
         }
        return matrix; 
    }
    
    
    
    public static void statArray(double[][][][] matrix) {
            double total = 0;
            int counter = 0;
            for (int w = 0; w < matrix.length; w++) {
                for (int x = 0; x < matrix[w].length; x++) {
                    for (int y = 0; y < matrix[w][x].length; y++) {
                        for (int z = 0; z < matrix[w][x][y].length; z++) {
                            total += matrix[w][x][y][z];
                            counter++;
                        }
                    }
                }
            }
            total = Double.parseDouble(String.format("%.1f",total));
            System.out.println("Sum: "+total);
            System.out.println("The number of elements: "+counter);
            double average = total/counter;
            average = Double.parseDouble(String.format("%.1f",average));
            System.out.println("The average is:"+average);
    }
    
    public static void printArray(double[][][][] matrix){
        System.out.println("{ ");
        for (int w = 0; w < matrix.length; w++) {
                System.out.print("{ ");
                for (int x = 0; x < matrix[w].length; x++) {
                    System.out.print("{ ");
                    for (int y = 0; y < matrix[w][x].length; y++) {
                        System.out.print("{ ");
                        for (int z = 0; z < matrix[w][x][y].length; z++) {
                            System.out.print(matrix[w][x][y][z] + ", ");
                        }
                        System.out.print(" }");
                    }
                    System.out.println(" }");
                }
                System.out.println(" }");
            }
            System.out.println(" }");
            }

            public static void sort4DArray(double[][][][] list) {
                double[][][] currentElement;
                double[][][] temp;
                for (int i = 1; i < list.length; i++) {
                    currentElement = list[i];
                    int k;
                    for (k = i - 1; k >= 0 && list[k].length > currentElement.length; k--) {
                        list[k + 1] = list[k];
                    }
                    list[k + 1] = currentElement;
                }
            }
    
    public static void sort3DArray(double[][][][] list) {
            for (int w = 0; w < list.length; w++) {
            selectionSort(list[w]);
            }
    }

    public static void selectionSort(double[][][] list) {
       double [][] currentMin = new double [50][50]; 
        for (int i = 0; i < list.length - 1; i++) {
            System.arraycopy(list,0,currentMin,0,list.length);
            int currentMinIndex = i;
    
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.length > list[j].length) {
                    System.arraycopy(list,0,currentMin,0,list.length);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    
}


//Sorry I tried everything I couldn't get it to sort
            


