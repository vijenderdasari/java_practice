/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay{
  public static void main(String[] args){
    int day;
    Scanner sc=new Scanner(System.in);
    System.out.println("display day");
    day=sc.nextInt();
  switch (day){
    case 1:     
   System.out.println("display the monday");
 break;
    case 2:
  System.out.println("display the thuday");
 break;
    case 3:
  System.out.println("display the wenday"); 
 break;
    case 4:
  System.out.println("display the thruday");
 break;
    case 5:
  System.out.println("display the friday");
 break;
    case 6:
  System.out.println("display the saturday");
 break;
    case 7:
  System.out.println("display the sunday");
 break;
}
}
}



