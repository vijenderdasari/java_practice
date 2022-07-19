import java.util.*;
class Arraynagativenumber{
  public static void main(String[] args){
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the element");
    for( i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
      if(a[i]<0){
        System.out.println("nagative number="+a[i]);
      }
    }
  }
}