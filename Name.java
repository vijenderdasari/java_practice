//write a java progarm to find total no of alphabets,number,special character in a string
//vijay@123
import java.util.Scanner;
class Name
{
  public static void main(String[] args)
{
  String str="vijay@123";
    int i;
     int alpha=0;
     int num=0;
     int spl=0;
  
  for(i=0;i<str.length();i++)
{  
  char ch=str.charAt(i);
  if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
{
  alpha++;
}
  else if(ch>='0' &&  ch<='9')
  {
    num++;
  }    
  else
  {
    spl++;
  }
  }
System.out.println("alphabets :"+alpha);
 System.out.println("Numbers :"+num); 
  System.out.println("special :"+spl);
}
}
    