//Daniel Reilly
//4/7/15
//CSE002 hw10
//Remove Elements Programs
//This program remove elements from an array


//Main method given
import java.util.Scanner;
public class RemoveElements {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index, target;
        String answer = "";
        do {
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
            String out = "The original array is:";
            out += listArray(num);
            System.out.println(out);

            System.out.print("Enter the index ");
            index = scan.nextInt();
            newArray1 = delete(num, index);
            String out1 = "The output array is ";
            out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
            System.out.println(out1);

            System.out.print("Enter the target value ");
            target = scan.nextInt();
            newArray2 = remove(num, target);
            String out2 = "The output array is ";
            out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
            System.out.println(out2);

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
    
    //generates an array of 10 random integers between 0 to 9
    public static int[] randomInput() {
        int [] numberArray = new int [10];
            for(int i=0; i<10; i++){
            int number = (int)(Math.random()*10);
            numberArray[i]=number;
            }
        return numberArray;
    }
    
    //Create a new array that has one member fewer than list, and be composed 
    //of all of the same members except the member in the position pos.
    public static int[] delete(int[] list, int pos) {
        int[] newArray1 = new int[list.length - 1];
        int counter = 0;
        int counter2 = 0;
        //Goes through the array and copies all numbers that don't match the target into a new array
        if (pos > -1 && pos < 10) {
            for (counter2 = 0; counter2 < list.length; counter2++) {
                if (counter2 == pos) {
                    continue;
                }
                newArray1[counter++] = list[counter2];
            }
        }
        else {
            System.out.println("Input is invaild");
            return list;
        }
        return newArray1;
    }
    
    //Deletes all the elements that are equal to target, returning a new list
    //without all those new elements.
    public static int[] remove(int [] list,int target) {
        int counter3=0; 
        //This loop sees how many targets are in the original array to generate a new array of the proper size
        for(int i=0; i<list.length; i++){
            if(list[i]==target){
                counter3++;
            }
        }
        //Statements that say if the target was found or not
        if(counter3>0){
            System.out.println("Element "+target+" was found");
        }
        else{
            System.out.println("Element "+target+" was not found");
        }
        //Goes through the array and copies all numbers that don't match the target into a new array
        int[] newArray1 = new int[list.length - counter3];
        int counter=0; 
        int counter2=0;
            for(counter2=0;counter2<list.length;counter2++){
            if(list[counter2]==target){
                continue;
            }
            newArray1[counter++]=list[counter2];
            }
        return newArray1;
    }

}

