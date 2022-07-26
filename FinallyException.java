class FinallyException {
  public static void main(String[] args)
  {
    try
    {
      System.out.println(10/0);
    }
    catch(Exception e)
    {
      System.out.println("can not divide by zero");
    }
    finally
    {
      System.out.println("final block");
    }
    System.out.println("after finally block");
  }
}