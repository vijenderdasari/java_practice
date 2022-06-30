/*First line of the input is an integer N that gives the number of rows and columns of the grid.
Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
Output Format:
Output should display an integer that gives the count of numbered cells, given a valid initial board configuration.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
5
20 20 1 20 3
20 20 20 20 20
20 20 20 20 20
20 20 20 20 20
6 20 3 20 20
 
Sample Output 1:
4
 
Sample Input 2:
9
20 5 20 20 3 20 20 20 20
20 20 8 20 20 20 20 5 20
20 20 20 20 20 20 2 20 20
20 20 20 20 20 20 20 20 20
20 20 20 20 20 20 20 20 20
20 20 20 20 20 20 20 20 20
20 20 3 20 20 20 20 20 20
20 3 20 20 20 20 3 20 20
20 20 20 20 1 20 20 6 20
 
Sample Output 2:
10
*/
//two dimentional array
import java.util.*;
class twodimtest
  {
    public static void main(String args[])
    {
       int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row and column size");
     int n=sc.nextInt();
      int[][]  arr=new int[n][n];
      System.out.println("enter values");
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("numbered cells are");
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              if(arr[i][j]<=10){
                count++;
              }
            }
        }
      System.out.println(count);
    }
  }