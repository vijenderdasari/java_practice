/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/

<<<<<<< HEAD
import java.util.Scanner;
public class StudentResult {

//main method
  public static void main(String args[])
  {

//initialize student constructor 3 times with different names
    Student3 st1 = new Student3();  
    getStudentInput(st1); 
    Student3 st2 = new Student3();  
    getStudentInput(st2);  
    Student3 st3 = new Student3();  
    getStudentInput(st3);

//Create an array and add the 3 student to it
    Student3[] studentInfo = {st1, st2, st3};  
    displayPercentage(studentInfo);  
 } 
//create displayPercentage static method in that add a for loop for student array
  static void displayPercentage(Student3[] studentArray)
  {
    for(Student3 student:studentArray)
    {
      double[] subject = student.getSubject();  

//calculate percentage
      double sum = 0;  
      double  percent;  
      for(int j =0 ; j<5 ; j++)
      {  
        sum = sum +subject[j];  
      }
      
//display student details
      System.out.println("\nRoll Number : "+student.getRollNo());
      System.out.println("Name : "+ student.getName());
      percent = (student.getpercentage()/500)*100;
      System.out.println("percentage: "+Math.round(percent)+ "% \n");
    } 

}

//create getStudentInput method in that create a Scanner object and take input from user
  static void getStudentInput(Student3 student)
   {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the name : ");
     student.setName(input.nextLine());
     System.out.print("Enter the rollno : ");
     student.setRollNo(input.nextInt());

//print 5 subject marks using for loop
     double[] subject = new double[5];
     double total=0;
     for(int j=0 ; j<5 ; j++)
     {
       System.out.print("Enter the marks of subject "+(j+1)+" : ");  
       total=total+ input.nextInt();
     }
     student.setPercentage(total);
   }  
}


//create Student class 
class Student3
{

//declare and initialize variables
  int rollNo;
  double[] subject = new double[5];
  String name;
  double percentage;

//add getters and setters method
  public void setName(String studentName)
  {
    this.name = studentName;
  }
  public String getName()
  {
    return name;
  }
  public void setRollNo(int rollNum)
  {
    this.rollNo = rollNum;
  }
  public int getRollNo()
  {
    return rollNo;
  }
  public void setPercentage(double subjectsPercentage)
  {
    this.percentage = subjectsPercentage;
  }
  public double getpercentage()
  {
    return percentage;
  }
  public void setSubjects(double[] subjects)
  {
    this.subject = subjects;
  }
  public double[] getSubject()
  {
    return subject;
  }
}
=======
public class StudentResult {

//main method

//initialize student constructor 3 times with different names

//Create an array and add the 3 student to it

//create displayPercentage static method in that add a for loop for student array

//calculate percentage

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     
}

//create Student class 
class Student {

//declare and initialize variables

//add getters and setters method
}
}

//write the code and then submit again
//pull again. write the code and submit
>>>>>>> 9ef7395f5c1ea32ffb386e6823211d7bb9c91756
