//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        total_marks=500
        maximum_marks=350

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {

//Define the main method
  public static void main(String[] args){
  

//Declare the variables
  int total_markes;
  int maximum_markes;
  

//Use the scanner class to provide total_marks and maximum_marks at execution time

Scanner sc = new Scanner(System.in);
System.out6.println("Enter the total marks");
total_markes= sc.nextInt();
System.out.println("Enter maximum marks possible: "); 
maximum_markes=sc.nextInt(); 



//Calculate the percentage of marks
    int percentage=100*maximum_markes/total_markes;

//Print the Result
    System.out.println("percentage of ="+percentage);
  }

}