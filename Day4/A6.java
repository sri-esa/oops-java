package Day4;

public class A6 {
    A6() {
        System.out.println("A Constructor");
    }
}

class B6 extends A6 {
    B6() {
        System.out.println("B Constructor");
    }

    public static void main(String[] args) {
        A6 obj = new B6();
    }
}
