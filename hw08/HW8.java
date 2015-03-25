//Daniel Reilly
//3/24/15
//CSE002 hw08
//MG's Adventure Game -- A game is created using different methods

import java.util.Scanner;
import java.util.Random;

public class HW8 {
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    //cave graphic
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //boxes graphic 
    public static void box() {
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               ");
    }
    public static String getInput(Scanner scan, String string) {
        String contStatement = scan.next();
        if (contStatement.equals("C") || contStatement.equals("c")) { //Checks to see if the user enters C
            return (" "); //if user enters C it returns to the program 
        }
        else {
            System.out.println("Yea right loser!");
            System.exit(1); //if user doesn't enter c, the program exits 
        }
        return (" ");
    }


    public static String getInput(Scanner scan, String string, int trial) {
        Random rand = new Random();
        int criticalHits = 0;
        int escape = 0;
        while (criticalHits < 10) { //once 10 critical hits occurs the giant is killed 
            String attackInput = scan.next();
            //if user enters A, a random number between 0 and 1 
            if (attackInput.equals("A") || attackInput.equals("a")) {
                int x = rand.nextInt(2);
                if (x == 1) { //if random number is 1 there is a critical hit
                    System.out.println("Critical Hit");
                    criticalHits++; //counter to keep track of critical hits 
                }
                else {
                    System.out.println("Gosh! How can you miss it!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                    continue;
                }
            }
            //if the user enters E and random number is generated between 1 and 10
            else if (attackInput.equals("E") || attackInput.equals("e")) {
                escape = rand.nextInt(10) + 1; //generates random number between 1 and 10 
                if (escape == 10) { //if the random number equals 10 the user escapes and the game exits 
                    System.out.println("You escaped succesfully!");
                    System.exit(1);
                }
                else { //if the random number equals anything else the user doesn't escape and is prompted to enter A or e again
                    System.out.println("You couldn't escape!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                    continue;
                }
            }
            //if use enters anything but A, a, E, e they will be executed by the giant and exit the game 
            else {
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(1);
            }
        }
        return (" ");
    }




    public static String getInput(Scanner scan) {
        //scans for next int 
        if (scan.hasNextInt()) {
            int number = scan.nextInt(); 
            switch (number) { //switch statement that takes user input for box number 
                case 1:
                    System.out.println("You get a 30 rack of Natural Light");
                    break;
                case 2:
                    System.out.println("You get a 6 pack of Bud Light Platinums");
                    break;
                case 3:
                    System.out.println("You get a Keg!");
                    break;
                default:
                    System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                    System.exit(1);
                    break;
            }
        }
        //if user doesn't enter int it exits the progam
        else {
            System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
            System.exit(1);
        }
        return (" ");
    }



}