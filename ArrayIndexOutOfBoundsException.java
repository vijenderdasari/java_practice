/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/

import java.util.*;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int n=sc.nextInt(),i,count;
      int arr1[]=new int[n];
      int arr2[]=new int[n];
      int arr3[]=new int[n];
      int k=0;
      System.out.println("enter first array values");
       for(i=0;i<n;i++)
         {
           arr1[i]=sc.nextInt();
         }
      System.out.println("enter second array values");
       for(i=0;i<n;i++)
         {
           arr2[i]=sc.nextInt();
         }
      for(i=0;i<arr1.length;i++)
        {
          count=0;
          for(int j=1;j<=arr1[i]/2;j++)
            {
              if(arr1[i]%j==0)
              {
                count++;
              }
            }
          if(count<=1)
          {
            arr3[k]=arr1[i];
            k++;
          }
        }
      for(i=0;i<arr2.length;i++)
        {
          count=0;
          for(int j=1;j<=arr2[i]/2;j++)
            {
              if(arr2[i]%j==0)
              {
                count++;
              }
            }
          try{
          if(count<=1)
          {
            arr3[k]=arr2[i];
            k++;
          }
      }
      catch(Exception b)
        {
          System.out.println(b+" - cannot store more than "+n+" values");
        }
          System.out.println("prime numbers are");
          for(i=0;i<arr3.length;i++)
         {
           System.out.println(arr3[i]);
         }
    }
}
}