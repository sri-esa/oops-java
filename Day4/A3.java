package Day4;

class A3 {
    void show() {
        System.out.println("A show()");
    }
}

class B3 extends A3 {

    @Override
    void show() {
        System.out.println("B show()");
    }

    void show(int x) {
        System.out.println("B show(int): " + x);
    }

    public static void main(String[] args) {
        B3 obj1 = new B3();
        obj1.show();
        obj1.show(10);

        A3 obj2 = new B3();
        obj2.show();
    }
}
