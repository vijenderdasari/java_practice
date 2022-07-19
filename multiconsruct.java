// using multiple constructors 
import java.util.*;
class Employee
  {
    int eid;
    String ename;
    String edept;
    //default constructor using
    Employee()
    {
      eid=123;
      ename="vijay";
      edept="accounts";
    }
    //parameterized constructor//using 1st time
    Employee(int id,String n,String ed)
    {
      eid=id;
      ename=n;
      edept=ed;
    }
   //using 2nd time  parametreized constructor
    Employee(int id,String n)
    {
      eid=id;
      ename=n;
    }
    //using 3rd time parametreized constructor
    Employee(int id)
    {
      eid=id;
    }
    //using toString class for written return method. 
    public String toString()
    {
      return eid+" "+ename+" "+edept;
    }
    
  }
//this is the maind method of object
class multiconsruct
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee emp1=new Employee();
      int id=sc.nextInt();
      String name=sc.next();
      String dept=sc.next();
      Employee emp2=new Employee(id,name,dept);
      Employee emp3=new Employee(12,"naveen");
      System.out.println(emp1);
      System.out.println(emp2);
    }
  }