abstract class Shape {
 
    public abstract double area();
 
    public abstract double perimeter();  
}
 
class Rectangle extends Shape {
    private double width;
    private double height;
 
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
 
 
    public double area() {
        return width * height;
    }
 
 
    public double perimeter() {
        return 2 * (width + height);
    }
}
 
class Circle extends Shape {
    private double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
 
    public double area() {
        return Math.PI * radius * radius;
    }
 
 
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
 
public class Abstraction2{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);
 
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
 
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }

}
