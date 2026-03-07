package Day4;

public class A4 {
    A4() {
        System.out.println("A");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A4 obj = new B4();
    }
} 
