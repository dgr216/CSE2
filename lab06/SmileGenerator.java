//Daniel Reilly
//2/27/15
//CSE002 lab06
//Smile Generator Program
//Print out 5 smiley faces using non-nested for loops

public class SmileGenerator {
    public static void main(String[] args) {
 
    int counter = 0;
    
    while(counter<5){
        System.out.print(":)");
        counter++;
    }
    System.out.println("");    
    
    for(int k=0; k<5; k++){
        System.out.print(":)");
    }
    System.out.println(""); 
    int counter5 = 0;
    do{
        System.out.print(":)");
        counter5++;
    }while(counter5<5);
    System.out.println(""); 
    
    int counter2 = (int)((Math.random())*100); 
    System.out.println(counter2);
    int x=0;
    while(x>=0 && x<counter2){
        System.out.print(":)");
        x++;
    }
    
    System.out.println(""); 
    
    int counter3 = (int)((Math.random())*100); 
    System.out.println(counter3);
    int z=0;
    while(z>=0 && z<counter3){
        System.out.print(":)");
        z++;
        if(z==30){
        System.out.println("");
        }
        if(z==60){
            System.out.println("");
        }
        if(z==90){
            System.out.println("");
        }
    }
    System.out.println("");
    
    int counter4 = (int)((Math.random())*100); 
    System.out.println(counter4);
    int linenumber=1;
    int q=1;
    for(int k=0; k<counter4; k++){
        System.out.print(":)");
         if (q==linenumber){
         linenumber++;
         System.out.println("");
         q=0;
         }
         q++;
    }
    
    System.out.println("");
    
    } 
}