import java.util.*;
public class triangles{
  public static void main(String args[]){
    int b, h;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter b value");
    b=sc.nextInt();
    System.out.println("enter h value");
    h=sc.nextInt();
    int area =(b*h)/2;
    System.out.println("area of triangle="+area);
  }
}