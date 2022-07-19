//write a progarm and declare variables and using constuctor(parameterized) create a object and print the array of 5 elements.
import java.util.*;
class Student{
  int id;
  String name;
  Student(int id,String name){
    this.id=id;
    this.name=name;
  }
  void display()
  {
  System.out.println(id+" "+name);
  }
}

//main method using print 5 elemtnts in array
class Constuctor{
  public static void main(String[] args)
  {
  Student st[]=new Student[5];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<5;i++)
  {
  System.out.println("enter Student information");
    
  System.out.println("enter the rollno");
    int id=sc.nextInt();
  System.out.println("enter the name"); 
    String name=sc.next();
    st[i]=new Student(id,name);   
  }
    for(int i=0;i<5;i++)
  st[i].display();
    
}
  } 