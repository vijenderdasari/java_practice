import java.util.*;
class maxnumber{
  public static void main(String args[]){
    int n, i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter Array size");
    n=sc.nextInt();
    System.out.println("enter elements");
    int a[]=new int[n];
    for( i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    int maximum=a[0];
    System.out.println("maximum value is");
    for(i=0;i<n;i++){
      if(a[i]>maximum)
        maximum=a[i];
    }
    System.out.println(maximum);
  }
}