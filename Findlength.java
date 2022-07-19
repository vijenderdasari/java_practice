//write a java program to find length of a string and compare and concatenate two strings.
class Findlength
  {
    public static void main(String[] args)
    {
      String str="vijay";
      String str1="dasari";
      System.out.println("length of a string is:"+str.length());
      System.out.println(str.compareTo(str1));
      String str3=str.concat(str1);
      System.out.println(str3);
    
    }
  }