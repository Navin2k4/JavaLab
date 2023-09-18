import java.util.Scanner;
interface Resizable {
    void resize(double factor);
}
class Rectangle implements Resizable {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
    @Override
    public void resize(double factor) {
        this.length *= factor;
        this.breadth *= factor;
    }
}
class Circle implements Resizable {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length and breadth for the rectangle: ");
        double lengthRectangle = scanner.nextDouble();
        double breadthRectangle = scanner.nextDouble();
        System.out.print("Enter radius for the circle: ");
        double radiusCircle = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(lengthRectangle, breadthRectangle);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        rectangle.resize(5);
        System.out.println("Resized Area of rectangle: " + rectangle.area());
        System.out.println("Resized Perimeter of rectangle: " + rectangle.perimeter());
        Circle circle = new Circle(radiusCircle);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circumference of circle: " + circle.circumference());
        circle.resize(10);
        System.out.println("Resized Area of circle: " + circle.area());
        System.out.println("Resized Circumference of circle: " + circle.circumference());
    }
}
