import java.util.*;
public class even{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    if(n%2==0){
      System.out.println("even number="+n);
    }
    else{
      System.out.println("odd number="+n);
    }
  }
}