//write a progarm and declare variables and using inheritance and using constructor create a object and print the array of 5 elements.
import java.util.*;
class Student{
  int rollno;
  String name;
  Student(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
  }
  void display()
  {
  System.out.println(rollno+" "+name);
  }
  }
class Mathstudent extends Student{
  String subject;
  Mathstudent(int rollno,String name,String subject) {
  
  super(rollno,name);
  this.subject=subject;
}
  void subjectDetails()
  {
  System.out.println(rollno+" "+name+" "+subject);
}
} 

//main method using print 5 elemtnts in array
class ConstInher{
  public static void main(String[] args)
  {
  Mathstudent st[]=new Mathstudent[5];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<5;i++)
  {
  System.out.println("enter student information");
    
  System.out.println("enter the rollno");
    int rollno=sc.nextInt();
  System.out.println("enter the name"); 
    String name=sc.next();  
    System.out.println("enter the subject"); 
    String subject=sc.next();
    st[i]=new Mathstudent(rollno,name,subject);
  }
    for(int i=0;i<5;i++)
 st[i].display();
}
  }