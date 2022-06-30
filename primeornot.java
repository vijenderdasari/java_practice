import java.util.*;
class primeornot{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
  int no,count=0;
  System.out.println("enter any num");
  no=sc.nextInt();
    for (int i=1;i<=no;i++){
      if(no%i==0)
        count++;
          if(count==2)
        System.out.println("num is prime");
      else
      System.out.println("num is not  prime");  
    }   
    }
}
}