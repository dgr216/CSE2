import java.util.Scanner;

public class Practice{
  public static void main(String[] args){
   int i;
   int lineNumber=1;
   for(i=2;i<=4;i++){
       int b=0;
       while(b<lineNumber){
           System.out.print("b");
           b++;
       }
       if(b == lineNumber){
            System.out.println(" ");
            lineNumber++;
            continue;
       }
       if(lineNumber == i){
           i++;
           continue;
       }
   }
    
  }  
    
}