package Day4;

public class A5 {
    int x;

    A5(int x) {
        this.x = x;
    }
}

class B5 extends A5 {
    int y;

    B5(int x, int y) {
        super(x);
        this.y = y;
    }

    void show() {
        System.out.println("Parent x = " + x);
        System.out.println("Child y = " + y);
    }

    public static void main(String[] args) {
        B5 obj = new B5(10, 20);
        obj.show();
    }
}
