 import java.util.*;
class Twodimensional
  {
    public static void main(String args[])
    {
       int row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      row=sc.nextInt();
      System.out.println("Enter col size");
      col=sc.nextInt();
      //declare
      int[][]  arr=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("***** 2 Dimenssion******");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
     
    
    }
  }