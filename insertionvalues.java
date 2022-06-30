 import java.util.*;
class insertionvalues
  {
    public static void main(String args[])
    {
       int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of an array");
      n=sc.nextInt();
      int arr[]=new int[n+1];
      System.out.println("array Length");
      System.out.println(arr.length);
      System.out.println("Enter array elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Before insertion");
      for(int i=0;i<n;i++)
        {
        System.out.println(arr[i]);
        }
      System.out.println("enter the element which you want to insert");
      int ele=sc.nextInt();
      System.out.println("enter the position");
      int position=sc.nextInt();
      for(int i=(n-1);i>=(position-1);i--)
        {
          arr[i+1]=arr[i];
        }
      arr[position-1]=ele;
      System.out.println("After insertion");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    
    }
  }