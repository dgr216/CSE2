//Daniel Reilly
//4/28/15
//CSE002 lab13
//Ragged Arrays 


public class lab13 {

    public static void main(String[] args) {
            int[][] stuff = new int[5][];
            for (int i = 0; i < 5; i++) {
                stuff[i] = new int[i * 3 + 5];
                for (int j = 0; j < stuff[i].length; j++) {
                    stuff[i][j] = (int)(Math.random() * 30);
                }
            }
            print(stuff);
            System.out.println(" ");
            sort(stuff);
            print(stuff);
            System.out.println(" ");
            copy(stuff);
            
    }
    public static void print(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            System.out.print("{ ");
            for (int z = 0; z < matrix[y].length; z++) {
                if (z == (matrix[y].length - 1)) {
                    System.out.print(matrix[y][z]);
                }
                else {
                    System.out.print(matrix[y][z] + ", ");
                }
            }
            System.out.println(" }");
        }
    }
    public static void sort(int[][] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list[i].length; j++) {
                int currentElement = list[i][j];
                int k;
                for (k = j - 1; k >= 0 && list[i][k] > currentElement; k--) {
                    list[i][k + 1] = list[i][k];
                }
                list[i][k + 1] = currentElement;
            }
        }
    }
    public static void copy(int[][] list){
        int [][] result = new int[5][17];
        for(int i = 0; i < list.length; i++){
            for(int j =0; j<list[i].length;j++){
                result[i][j]=list[i][j];
            }
        }
        print(result);
    }
    
    
}