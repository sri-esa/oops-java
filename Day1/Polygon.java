package Day1;
class perimeter{
    String name;
    int sides;
    float sideLength;
    float calculatePerimeter(){
        float p=0;
        for(int i=0;i<sides;i++){
            p+=sideLength;
        }
        return p;
    }
}
public class Polygon {
    public static void main(String[] args){
        perimeter p1=new perimeter();
        p1.name="Triangle";
        p1.sides=3;
        p1.sideLength=5.0f;
        System.out.println("Perimeter of " + p1.name + ": " + p1.calculatePerimeter());

        perimeter p2=new perimeter();
        p2.name="Square";
        p2.sides=4;
        p2.sideLength=4.0f;
        System.out.println("Perimeter of " + p2.name + ": " + p2.calculatePerimeter());
    }
}
