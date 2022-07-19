interface Addition
     {
       int addition=20;//public static final
       void add();
     }
interface subtraction
  {
    void sub();
  }
class Cal implements Addition,subtraction
  {
    public void add()
    {
      int a=10,b=20;
      System.out.println((a+b));
    }
    public void sub()
    {
      int a=10,b=20;
      System.out.println((a-b));
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Addition sum=new Cal();
      sum.add();
    }
  }