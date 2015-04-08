import java.util.Scanner;
public class Test2Review{
  public static void main(String[] args){
    int j = 10;
    int k = 2;
    int y = 0;
    int z = 5;
    /** The test has four questions
      * uncomment the question you 
      * want to complete, complie and
      * run the program. You get 5 tries
      * to get the correct answer    */
    
    /**             QUESTIONS              */
    //Question #1
    //int answer = doSomething(j, k);
    // Question #2 
    //int answer = doSomething(j, k, "TEST");
    // Question #3 
    //int answer = doSomething(false, 3);
    // Question #4 
    int answer = doSomething(y, z, 10);
    int count = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("What value is stored in variable 'answer'?");
    while(true){
      int guess = scan.nextInt();
      if(count == 5){
        System.out.println("You failed:(");
        break;
      }
      if(guess == answer){
        System.out.println("Congrats you got it right!");
        break;
      }
      else{
        System.out.println("Wrong! Try again");
        count++;
      }
    }
  }
  public static int doSomething(int j,int  k){
    int i;
    for(i = 0; i<j; i++){
      k--;
    }
    return i*j*k;
  }
  public static int doSomething(int k, int j, String str){
    while(j > k){
      if(str.equals("HI")){
        return j*k;
      }
      else if(str.equals("TEST")){
        return j+k;
      }
      else{
        break;
      }
    }
    int temp;
    temp = k;
    k = j;
    j = temp;
    str = j + k + str + j + k;
    if(str.equals("102TEST102")){
      return 100;
    }
    else if(str.equals("12TEST12")){
      return 200;
    }
    else if(str.equals("12TEST102")){
      return 300;
    }
    else if(str.equals("210TEST210")){
      return 400;
    }
    else if(str.equals("12TEST210")){
      return 500;
    }
    else{
      return 600;
    }
  }
  public static int doSomething(boolean bool, int num){
    int num1 = 0;
    switch(num%2){
      case 0:
        return 1;
      case 1:
        for(int i = 0; i <= num; i++){
          bool = !bool;
          for(int j = 0; j <= i; j++){
            num1 += i;
          }
      }
        if(bool){
          return 2;
        }
      case 2:
        bool = !bool;
        num1+=5;
        num-=5;
        break;
    }
    if(bool){
      return num1;
    }
    else{
      return num;
    }
  }
  public static int doSomething(int z, int y, int ans){
    while(true){
      if(doSomethingElse(y, z)){
        break;
      }
      else{
        ans=ans+y+z;
        y++;
      }
    }
    return ans;
  }
  public static boolean doSomethingElse(int z, int y){
    y += 10;
    if(y == z){
      return true;
    }
    return false;
  }
}

  
  
  
  
  
  