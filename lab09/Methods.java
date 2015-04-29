//Daniel Reilly
//4/26/15
//CSE002 lab09  
//Random Sentence Generator 


import java.util.Scanner;
import java.util.Random;


public class Methods {

    public static void main(String[] args) {
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner(System.in);
        while (true) {
            String adj = adjective();
            String adj1 = adjective();
            String adj2 = adjective();
            String sub = subject();
            String verb = verb();
            String obj = object();


            System.out.println("The " + adj + " " + adj1 + " " + sub + " " + verb + " the " + adj2 + " " + obj);

            System.out.println("Press Y or y if you would like to create another sentence");
            System.out.println("Press anything else to exit");
            String x =myScanner.next();
            if (x.equals("Y") || x.equals("y")) { //Checks to see if the user enters Y
                continue; //if user enters C it returns to the program 
            }
            else {
                break;
            }
        }

    }
    public static String adjective(){
    Random rnd = new Random();
    int numb = rnd.nextInt(10);
    switch (numb){
        case 0:
            return "good";
        case 1:
            return "little";
        case 2:
            return "great";
        case 3:
            return "old";
        case 4: 
            return "young";
        case 5:
            return "different";
        case 6:
            return "large";
        case 7:
            return "important";
        case 8:
            return "smart";
        case 9: 
            return "bad";
        default:
            return "bad";
    }



    }   
    public static String subject(){
         Random rnd = new Random();
    int numb = rnd.nextInt(10);
    switch (numb){
        case 0:
            return "fox";
        case 1:
            return "dog";
        case 2:
            return "god";
        case 3:
            return "cat";
        case 4: 
            return "leperchaun";
        case 5:
            return "unicorn";
        case 6:
            return "dinosaur";
        case 7:
            return "girl";
        case 8:
            return "hamster";
        case 9: 
            return "elephant";
        default:
            return "elephant";
    } 
}
    public static String verb(){
    Random rnd = new Random();
    int numb = rnd.nextInt(10);
    switch (numb){
        case 0:
            return "passed";
        case 1:
            return "ate";
        case 2:
            return "hid from";
        case 3:
            return "held";
        case 4: 
            return "led";
        case 5:
            return "stole";
        case 6:
            return "smelt";
        case 7:
            return "shot";
        case 8:
            return "sold";
        case 9: 
            return "won";
        default:
            return "won";    
    
    }
}
    public static String object(){
    Random rnd = new Random();
    int numb = rnd.nextInt(10);
    switch (numb){
        case 0:
            return "computer";
        case 1:
            return "desk";
        case 2:
            return "TV";
        case 3:
            return "book";
        case 4: 
            return "food";
        case 5:
            return "cow";
        case 6:
            return "bed";
        case 7:
            return "lamp";
        case 8:
            return "teacher";
        case 9: 
            return "bag";
        default:
            return "bag";
    }
    }
}