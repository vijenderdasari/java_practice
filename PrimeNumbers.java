/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/


//import statements for java program to read inputs using Scanner class 
import java.util.*;

public class PrimeNumbers
  {
  
//Add main method here
public static void main(String[] args)
    {
//Declare variables num1, num2, i, count and initialize count as zero
  
//Use the scanner class to provide input at execution time using scanner object
//Scanner sc= new Scanner(System.in);
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
        
    for(int i=1;i<=a;i++)
    {
      int count=0;
      for(int j=1;j<=i;j++){
      if(i%j==0){
        count++;
    }   
    }
    if(count<=2)
    {
      System.out.println(i);
    }
    }       
  }
}
