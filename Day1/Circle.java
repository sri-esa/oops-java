package Day1;
class circ{
    float radius;
    double diameter(){
        return 2 * radius;
    }
    double circumference(){
        return 2 * Math.PI * radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
public class Circle {
    public static void main(String[] args){
        circ c1=new circ();
        c1.radius=7.5f;
        System.out.println("Diameter=" + c1.diameter());
        System.out.println("Circumference=" + c1.circumference());
        System.out.println("Area=" + c1.area());
    }
}