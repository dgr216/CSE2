//Daniel Reilly
//3/20/15
//CSE002 lab08
//The factorial of an positive integer n! equals to n*(n-1)*(n-2)...1
//In this lab we are calculating super factorial which is defined as the the sum of n!+(n-1)!+(n-2)!...1!

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sup = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= sup; i++){
            sum += factorial(i);
        }
        print(sum);
  }
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }
    public static void print(int num){
        System.out.println("The super factorial is equal to " + num);
    }
}
