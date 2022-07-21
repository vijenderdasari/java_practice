/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first value: 
    10
    Enter second value: 
    20
    
    Expected Output:
    a*=b is: 200
    a-=b is: 180
    a/=b is: 9
    a%=b is: 9
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class ShortHandOperators {

//main method
  public static void main(String[] args)
   {
     int a,b;
     

    
  

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the a,b values");
     a=sc.nextInt();
     b=sc.nextInt();

/*
  Take input from user
  System.out.println("Enter first value: ");
  int a=sc.nextInt();
*/

//print appropriate result for assignment operators
      int multipler=a*=b;
      int sub=a-=b;
      int divide=a/=b;
      int modulus=a%=b;
     System.out.println("multiplie value="+multipler);
     System.out.println("decrement value="+sub);
     System.out.println("divide value="+divide);
     System.out.println("modulus value="+modulus);
     
        
}
}

//Good Job!