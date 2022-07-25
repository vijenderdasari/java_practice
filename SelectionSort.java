 //selection Sort
class SelectionSort
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
      for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
       System.out.println("after sorting");
       for(i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }