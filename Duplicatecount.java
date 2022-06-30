//find duplicate numbers in array
import java.util.*;
class Duplicatecount
{ 
    public static void main(String[] args)
    {    
       int count=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter array size");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter elements");
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
      System.out.println("Duplicate elements are ");
      for(int i=0; i<arr.length; i++) 
      { 
       for(int j=i+1; j<arr.length; j++)
         {  
                if(arr[i]== arr[j])
                {
                  count++;
                }
        }
      } 
      System.out.println(count);
    }
}