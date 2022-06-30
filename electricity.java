import java.util.*;
public class electricity{
  public static void main(String[] args){
    int units;
    double bill=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    units=sc.nextInt();
    
    if(units<50)
    {
      bill=0.5*units;
      
    }
    else if(units<150){
      bill=(50*0.50)+(units-50)*0.75;
    }
else if(units>250){
  bill=(50*0.50)+(100*0.75)+(units-150)*1.20;
}
    else
{
  bill=(50*0.50)+(100*0.75)+(100*1.20)+(units-250)*1.50;
}
    System.out.println("electricity bill"+units+"is="+bill);
   
    
  }
}