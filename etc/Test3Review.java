//Test 3 

public class Test3Review{
  public static void main(String[] args){
    int [] array = {3,12,15,6,0,0,0,0,0};
    print(array);
    String[] x={"one", "two", "to", "fifteen", "three"};
    String[] y = range(x);
    System.out.println(y[0]);
    System.out.println(y[1]);
  }
 
    public static void print(int[] array){
        int number = array[0];
        if(number>array.length - 1){
            System.out.println("Error x[0] exceeds x.length-1");
        }
        else{
            System.out.print("{");
            for(int i=1; i<=number;i++){
            System.out.print(array[i]+", ");
            }
            System.out.println("}");
        }
       
    }
    public static String[] range(String[] array){
        int max = array[0].length();
        int min = array[0].length();
        String maxString = "0";
        String minString = "0";
        String[] result = new String[2];
        for(int i=0;i<array.length;i++){
            if(array[i].length()>=max){
                maxString = array[i];
                max = array[i].length();
            }
            else if(array[i].length()<=min){
                minString = array[i];
                min = array[i].length();
            }
        }
        result[0] = minString;
        result[1] = maxString;
        return result;
    } 
}