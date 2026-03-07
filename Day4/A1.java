package Day4;

class A1 {
    int x = 10;
}

class B1 extends A1 {
    int x = 20;

    public static void main(String[] args) {
        A1 obj = new B1();
        System.out.println(obj.x);
    }
}
