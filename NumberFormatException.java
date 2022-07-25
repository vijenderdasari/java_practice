/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.*;
public class NumberFormatException {
    String addNumbers(String a, String b) {
    String sum = a + b;
    return sum;
  }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      NumberFormatException obj = new NumberFormatException();
      System.out.println("Enter a first number");
      String num1 = sc.next();
      System.out.println("Enter the second number");
      String num2 = sc.next();
      String result = num1+num2;
      result = obj.addNumbers(num1, num2);
      int a = Integer.parseInt(result);
      System.out.println(a);
      System.out.println("Sum is: " + result);
      

    }
}
