//find first occurance of a character
class Firstoccurance
{
  public static void main(String[] args)
{
  int i,count=0;
    String s1="vijay";
  char check='a';
    for(i=0;i<s1.length();i++)
    {
      if(s1.charAt(i)==check)
    {
        count++;
      if(count==1)
      {
        break;
      }
      }
    }
  if(count==0)
  {
    System.out.println("not found");
  }
  else{
    System.out.println("first occurance of"+check +"at index value"+i);
  }
}
}
  