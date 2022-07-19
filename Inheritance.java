//write a progarm and declare variables and using inheritance create a object and print the array of 5 elements.
import java.util.*;
class Student{
  int rollno;
  String name;
  void display()
  {
  System.out.println(rollno+" "+name);
  }
  }
class Mathstudent extends Student{
  String subject;
  void subjectDetails()
  {
  System.out.println(rollno+" "+name+" "+subject);
}
} 

//main method using print 5 elemtnts in array
class Inheritance{
  public static void main(String[] args)
  {
  Mathstudent st[]=new Mathstudent[5];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<5;i++)
  {
  System.out.println("enter student information");
    st[i]=new Mathstudent();
  System.out.println("enter the rollno");
    st[i].rollno=sc.nextInt();
  System.out.println("enter the name"); 
    st[i].name=sc.next();   
  }
    for(int i=0;i<5;i++)
  System.out.println(st[i].rollno+" "+st[i].name);
}
  }