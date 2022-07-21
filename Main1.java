class MultithereadingDemo extends Thread{
  public void run(){
    
    System.out.println("I am ");
    System.out.println(Thread.currentThread().getId());
  }
}
public class Main1{
  public static void main(String [] args){
    
    MultithereadingDemo obj=new MultithereadingDemo();
   
    obj.start();
  }
}