import java.util.*;
public class maxthree{
  public static void main(String[] args){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c values");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b&&a>c){
      System.out.println("maximum value="+a);
    }
    else if(b>a&&b>c){
      System.out.println("maximum value="+b);
  }
  else{
      System.out.println("maximun value="+c);
  }
}
}