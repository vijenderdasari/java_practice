//Write  a JAVA program to calculate product of digits of a number

import java.util.*;
class product{

  public static void main(String[] args)
  {
    int n, product=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    
    while(n!=0)
      {
        int remainder=n%10;
        product=product*remainder;
        n=n/10;
      }
    System.out.println("product of number="+product);
    
      }
}
    