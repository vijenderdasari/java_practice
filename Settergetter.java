//here setter&getter method using in this
import java.util.*;
class Employee
  {
   private int eid;
   private String ename;
   private  String edept;
    //getters and setters methods
    //setter used to set the values to variable
    //getter method used to get the value of varaible
    void setEid(int id)
    {
      eid=id;
    }
    int getEid()
    {
      return eid;
    }
   
    
    public String toString()
    {
      return eid+" "+ename+" "+edept;
    }
    
  }
class Settergetter
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee emp1=new Employee();
     emp1.setEid(123);
      System.out.println(emp1.getEid());
     
     
    }
  }