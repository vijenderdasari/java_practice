import java.util.*;
class dupnum1{
  public static void main (String[] args){
    //intialize array

  int[]arr=new int[]{1,2,3,4,2,7,7,3};
  
    System.out.println("duplicate elements in given array");
   //searches for duplicate element
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
    System.out.println(arr[j]);
        }
    }
  }
}