import java.util.*;
class Revpalindrome
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
      if(str.equals(rev))
      {
        System.out.println("Palindrome");
      }
      else
      {
        System.out.println("not palindrome");
      }
      
     
    }
  }