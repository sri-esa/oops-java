package Day4;

public class Demo {

    Demo() {
        System.out.println("Default");
    }

    Demo(int x) {
        System.out.println("Parameterized");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(5);
    }
} 
