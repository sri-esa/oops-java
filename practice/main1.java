package practice;

abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void area(){
        System.out.println("Area of rectangle: " + (length * width));
    }
}
public class main1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        circle.area();
        rectangle.area();
    }
}
