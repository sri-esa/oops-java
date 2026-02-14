package Day2;

public class Rectangle {
    double length;
    double breadth;
    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    double peri(){
        return 2*(length+breadth);
    }
    double area(){
        return length*breadth;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        System.out.println("Perimeter of the rectangle: " + r1.peri());
        System.out.println("Area of the rectangle: " + r1.area());
    }
}
