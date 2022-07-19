//Create an abstract class Shape with abstract method public abstract Double calculatePerimeter()Create a class Circle that extends Shape with following attributes,Attributes Datatype radius Float
//Create a class Rectangle that extends Shape with the following attributes,Attributes Datatype length Float breadth Float
//Create a class Square that extends Shape with the following attributes,Attributes Datatype side Float
//Implement the method calculatePerimeter() in all the child classes to calculate appropriate perimeters.
abstract class Shape
       {
         public abstract double calculatePerimeter();
       }
class Circle extends Shape
  {
    float radius;
    public double calculatePerimeter()
    {
      return 2*3.14*radius;
    }
    
  }
class Rectangle extends Shape
  {
    float length;
    float breadth;
    public double calculatePerimeter()
    {
     return 2*(length+breadth);
    }
    
  }
class Square extends Shape
  {
      float side;
    public double calculatePerimeter()
    {
      return 4*side;
    }
    
  
  }
  class Main2
    {
      public static void main(String args[])
      {
        Square rect=new Square();
        rect.side=4;
        double perimeter=rect.calculatePerimeter();
        System.out.println(perimeter);
      }
    }