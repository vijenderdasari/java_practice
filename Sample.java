// create class product, id, manufacture, price, quantity define the paremeterizewd constuctor ,tostring method,ctreate object ,display the product /*
import java.util.*;
class Task
  {
    Scanner s=new Scanner(System.in);
    String productname;
    int id;
    String manufacture;
    int price;
    //parametrerized constuctor
    Task(String n,int i,String m,int p)
    {
      productname=n;
      id=i;
      manufacture=m;
      price=p;
    } 
    //tostring 
    public String toString()
        {
        return "productname:"+productname+"id:"+id+"manufacture:" +manufacture+"price:"+price;
        }
    }
//main method
class Sample
  {
    public static void main(String[] args)
    {
      //create object
      Task s=new Task("honda",  111,  "warangal"  , 70000);
      System.out.println(s);
    }
  }