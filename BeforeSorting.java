 class BeforeSorting
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
      int ele=23;
      int count=1;
      //bubble sort
      for(i=0;i<n;i++)
        {
          if (ele==arr[i]) 
          {
            count++;
            break;
            
          }
        }
          if(count>1)
          {
  System.out.println("element is found at the position "+(i+1));
          }
          else
          {
  System.out.println("element is found not found  ");
          }
       
    }
  }