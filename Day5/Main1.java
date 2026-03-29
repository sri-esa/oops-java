package Day5;

interface Flyable {
    abstract void fly();
}
interface Swimmable {
    abstract void swim();
}
class Duck implements Flyable,Swimmable{
    public void fly() {
        System.out.println("Duck is flying");
    }
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
