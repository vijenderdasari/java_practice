import java.util.*;
class Mainrev
  {
    public static void main(String args[])
    {
      String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.println("enter String");
    String str=sc.nextLine(); 
   for(int i=str.length()-1;i>=0;i--)
     {
       rev=rev+str.charAt(i); 
     }
      System.out.println(rev);
     
      
     
    }
  }