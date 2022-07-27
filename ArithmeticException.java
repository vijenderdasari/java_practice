/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/

import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);  
      System.out.println("enter first number");
      int a=sc.nextInt();
      System.out.println("enter second number");
      int b=sc.nextInt();
      System.out.println("enter operation ");
      char operation=sc.next().charAt(0);
      switch(operation) {
          case '+':
          System.out.println(a+b);
          break;
          case '-':
          System.out.println(a-b);
          break;
          case '/':
          try{
          System.out.println(a/b);
          }
          catch (Exception obj) {
      System.out.println("cannot devide by 0");
    }
          break;
          case '*':
          System.out.println(a*b);
          break;
          default:
          System.out.println("enter valid input");
    }

    }
}