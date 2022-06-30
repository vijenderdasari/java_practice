import java.util.*;
public class max{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b values");
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b){
      System.out.println("maximum value="+a);
    }
    else
      System.out.println("maximum value="+b);
  }
}