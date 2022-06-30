//Write a JAVA program to check whether a number is palindrome or not.
import java.util.*;
class palindrome{
  public static void main(String[] args)
  {
    int n,remainder ,order=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    System.out.println("enter the number");
    int firstorder=n;
    while(n!=0)
    {
      remainder=n%10;
      order=order*10+remainder;
      n=n/10;
    }
    if(order==firstorder){
      System.out.println("number is palindrome");
    }
      else 
    {
      System.out.println("nimbetr is not palindrome");
    }
      }
}
      