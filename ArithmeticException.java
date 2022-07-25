/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException
{
  public static void main(String args[])
  {
      ArithmeticException obj=new ArithmeticException(10,0);//ArithmeticException will occur
    System.out.println("division is done");
    }
  ArithmeticException(int n1,int n2)
  {
    //ArithmeticException will occur here
    int c=n1/n2;
    System.out.println("n1/n2="+c);
  }
}

//Good Job!
