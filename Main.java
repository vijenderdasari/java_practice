class Main
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
          for(j=0;j<n-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
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