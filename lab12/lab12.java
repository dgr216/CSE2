//Daniel Reilly
//4/23/15
//CSE002 lab12
//Row and Column major format

import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        int width1 = (int)((Math.random() * 5) + 1);
        int height1 = (int)((Math.random() * 5) + 1);
        int width2 = (int)((Math.random() * 5) + 1);
        int height2 = (int)((Math.random() * 5) + 1);
        int[][] matrix1 = increasingMatrix(width1, height1, true);
        int[][] matrix2 = increasingMatrix(width1, height1, true);
        int[][] matrix3 = increasingMatrix(width2, height2, true);
        System.out.println("Matrix A");
        printMatrix(matrix1, true);
        System.out.println(" ");
        System.out.println("Matrix B");
        printMatrix(matrix2, false);
        System.out.println(" ");
        System.out.println("Matrix C");
        printMatrix(matrix3, true);
        System.out.println(" ");
        int[][] resultmatrix1 = addMatrix(matrix1, true, matrix2, false);
         if (resultmatrix1 != null) {
            printMatrix(resultmatrix1, true);
        }
        int[][] resultmatrix2 = addMatrix(matrix1, true, matrix3, true);
        if (resultmatrix2 != null) {
            printMatrix(resultmatrix2, true);
        }
    }
    
    public static int [][] increasingMatrix(int width, int height, boolean format){
        int [][] matrix = new int[width][height];
        int number = 1;
        if(format == true){
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    matrix[i][j]=number;
                    number++;
                }
            }
            return matrix;
        }
        
        else{
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    matrix[i][j]= 1 + i*j ;
                    number++;
                }
            }
        return matrix;    
        }
    }
    
    public static void printMatrix(int[][] array, boolean format) {
        if (format == true) {
            for (int y = 0; y < array.length; y++) {
                System.out.print("{ ");
                for (int z = 0; z < array[y].length; z++) {
                    if (z == (array[y].length - 1)) {
                        System.out.print(array[y][z]);
                    }
                    else {
                        System.out.print(array[y][z] + ", ");
                    }
                }
                System.out.println(" }");
            }
        }
        else {
            int [][] newArray = array;
            for (int y = 0; y < array.length; y++) {
                System.out.print("{ ");
                for (int z = 0; z < array[y].length; z++) {
                    if (z == (array[y].length - 1)) {
                        System.out.print(array[y][z]);
                    }
                    else {
                        System.out.print(array[y][z] + ", ");
                    }
                }
                System.out.println(" }");
            }
        }
    }
    public static int [][] translate(int[][] array){
        int [][] arrayNew = new int[array.length][array[0].length];
        for(int y = 0; y < array.length; y++){
            for(int z = 0; z<array[y].length; z++){
                arrayNew[y][z]=array[z][y];
            }
        }
        return arrayNew;
    }
   public static int [][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
      if(a.length!=b.length){
          System.out.println("Matrices can't be added");
          return null;
      }
      else if(a[0].length != b[0].length){
          System.out.println("Matrices can't be added");
          return null;
      }
      int[][] matrix = new int [a.length][a[0].length];
        for(int i=0; i<a.length;i++){
            for(int j = 0; j<a[i].length; j++){
                matrix[i][j]=a[i][j]+b[i][j]; 
            }
        }
      return matrix; 
    } 
    
}
