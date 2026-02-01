class calc {
    double length;
    double width;
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}
public class Recatangle {
    public static void main(String[] args) {
        calc rect = new calc();
        rect.length = 5.0;
        rect.width = 3.0;
        System.out.println("Area=" + rect.area());
        System.out.println("Perimeter=" + rect.perimeter());
    }
}