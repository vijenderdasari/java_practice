class MultiThread extends Thread
  {
    public void run()
    {
      System.out.println(" using thread");
    }
    
  }
class MainMultithread
  {
    public static void main(String args[])
    {
      MultiThread t=new MultiThread();
      t.start();
      System.out.println(t.getName());
    }
  }