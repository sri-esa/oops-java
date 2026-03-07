package Day2;

public class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x=p.x;
        this.y=p.y;
    }
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1);
        System.out.println("Point 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Point 2: (" + p2.x + ", " + p2.y + ")");
    }
}