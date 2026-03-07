package Day4;

class A2 {
    void show() {
        System.out.println("Class A show()");
    }
}

class B2 extends A2 {
    @Override
    void show() {
        System.out.println("Class B show()");
    }

    public static void main(String[] args) {
        A2 obj = new B2();
        obj.show();
    }
}
