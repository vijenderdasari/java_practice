//java program to calculate total,average percentage of marks
import java.util.*;
class Markstotal
  {
    public static void main(String[] args){
      float eng,phy,chem,math,comp;
      double total,average,percentage;
      Scanner sc=new Scanner (System.in);
      //input marks all five subjects
      System.out.println("enter marks of five subjects:");
      System.out.println("enter marks of english subject:");
      eng =sc.nextFloat();
      System.out.println("enter marks of physics subject:");
      phy =sc.nextFloat();
      System.out.println("enter marks of chemistry subject:");
      chem =sc.nextFloat();
      System.out.println("enter marks of mathamatics subject:");
      math =sc.nextFloat();
      System.out.println("enter marks of computers subject:");
      comp =sc.nextFloat();
/* calculate total ,average and percentage */
      total=eng+phy+chem+math+comp;
      average=(total/5.0);
      percentage=(total/500.0)*100;

/* print all results */
      System.out.print("total marks="+total);
      System.out.print("average marks="+average);
      System.out.print("percentage="+percentage);
      
      
    }
  }