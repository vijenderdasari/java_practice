//using sleep method
    class MultiThread extends Thread
  {
    public void run()
    {
      for(int i=1;i<=5;i++)
        {
          if(i%2==0)
          {
               System.out.println(i);
            try{
             Thread.sleep(100);
             }
          catch(Exception e)
            {
              System.out.println(e);
            }
          }
       
         
        }
    }
    
  }
class Sleepmethod
  {
    public static void main(String args[])
    {
      MultiThread t=new MultiThread();
      MultiThread t1=new MultiThread();
        MultiThread t2=new MultiThread();
      t.start();
      t1.start();
      t2.start();
      //System.out.println(t.getName());
    }
  }
