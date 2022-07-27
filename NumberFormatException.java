/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/

import java.util.Scanner;
public class NumberFormatException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first name");
      String first_name=sc.next();
      System.out.println("enter last name");
      String last_name=sc.next();
      System.out.println("enter mobile number");
      String mobileNumber=sc.next();
      System.out.println("Length of the first name string is: "+ first_name.length());
      System.out.println("Length of the last name string is: "+ last_name.length());
      try
        {
          long number=Long.parseLong(mobileNumber);
          long digit, sum=0;
          while(number>0)
          {
            digit = number%10;
            sum = sum+digit;
            number = number/10;
          }
          System.out.println("Sum of the phone number is: "+sum);
        }
      catch (Exception e)
        {
          System.out.println("Conversion failed "+e);
        }
    }
}