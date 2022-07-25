/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

//main method
  public static void main(String args[])
  {
//declare variables and take input from user
    String str;
    Scanner sc=new Scanner(System.in);
//creat stringbuffer object for string reversing
    StringBuffer sb=new StringBuffer();
    System.out.println("enter a string");
    str=sc.nextLine();
//reverse input string
    sb.append(str);
    sb.reverse();
//print entire string result
    System.out.println("reversing entire string: "+sb);
/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/
    String words[] = str.split(" ");
    String revString = "";

/* 
   Use charAt() function returns the character
   at the given position in a string
*/
    for(int i=0; i<words.length; i++)
      {
        String word = words[i];
        String rev = "";
        for(int j=word.length()-1; j>=0; j--)
          {
            rev = rev + word.charAt(j);
          }
        revString = revString +rev +" ";
      }

//print reverse each word string result
    System.out.print("reversing each word at its place: "+revString);
  }

}