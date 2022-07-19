import java.util.*;
class Endswith
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
System.out.println("enter String");
     String str=sc.nextLine();
      System.out.println("Enter the word which you want to find");
      String word=sc.next();
      if(str.endsWith(word))
      {
        System.out.println("Found");
      }
      else{
        System.out.println("not found");
      }
     
    }
  }

