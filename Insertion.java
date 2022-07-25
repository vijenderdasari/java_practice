//Insertion Sort
class Insertion
  {
    public static void main(String args[])
    {
      int i,j,temp;
     int arr[]={67,56,23,18,3,2};
      System.out.println("before sorting");
      int n=arr.length;
      for(i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
      //bubble sort
      for(i=1;i<n;i++)
        {
          for(j=i;j>0&&arr[j-1]>arr[j];j--)
            {
              
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
             
            }
        }
       System.out.println("after sorting");
       for(i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }