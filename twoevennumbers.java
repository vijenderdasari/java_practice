//using two dimensioan array&write the program for even numbers
import java.util.*;
class twoevennumbers{
  public static void main(String[] args){
    int row,col,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of row size");
    row=sc.nextInt();
    System.out.println("enter no of col size");
    col=sc.nextInt();

    int[][]arr=new int[row][col];
    for( i=0;i<row;i++);
    {
      for(int j=0;j<col;j++){
      arr[i][j]=sc.nextInt();
      }
    } 
    //find even numbers
   System.out.println("enter the even numbers");
   for( i=0;i<row;i++);
    {
    for(int j=0;j<col;j++){
      if(arr[i][j]%2==0){
    System.out.print(arr [i][j]+" ");
      }   
      }
     System.out.println(i); 
  }
}
}