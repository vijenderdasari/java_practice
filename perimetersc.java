import java.util.*;
public class perimetersc{
  public static void main(String[] args){
    
  
  double l, w, perimeter;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter l value");
    l=sc.nextDouble();
    System.out.println("enter w value");
    w=sc.nextDouble();
  perimeter=2*(l+w);
    System.out.println("area of perimeter="+perimeter);
}
}