class Shape { // parent class
    private double length;
    private double width;
 
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    public double getLength() {
        return length;
    }
 
    public void setLength(double length) {
        this.length = length;
    }
 
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        this.width = width;
    }
 
    public double area() {
        return 0.0;
    }
}
 
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }
 
    public double area() {
        return getLength() * getWidth();
    }
}
 
class Triangle extends Shape {
    public Triangle(double length, double width) {
        super(length, width);
    }
 
    public double area() {
        return 0.5 * getLength() * getWidth();
    }
}
 
public class poly {
    public static void main(String[] args) {
        Shape r1 = new Rectangle(5, 4);
        Shape t1 = new Triangle(3, 6);
 
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Triangle: " + t1.area());
    }
}