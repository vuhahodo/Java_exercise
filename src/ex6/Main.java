package ex6;

//Main.java
public class Main {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0, "blue", false);
     System.out.println(circle);
     System.out.println("Area: " + circle.getArea());
     System.out.println("Perimeter: " + circle.getPerimeter());
     
     Shape rectangle = new Rectangle(4.0, 6.0, "green", true);
     System.out.println(rectangle);
     System.out.println("Area: " + rectangle.getArea());
     System.out.println("Perimeter: " + rectangle.getPerimeter());
     
     Shape square = new Square(4.0, "yellow", true);
     System.out.println(square);
     System.out.println("Area: " + square.getArea());
     System.out.println("Perimeter: " + square.getPerimeter());
 }
}
