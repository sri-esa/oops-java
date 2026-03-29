package practice;

public class exception {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=5;
            int c=a/b;
            System.out.println("Result: "+c);
        } catch(ArithmeticException e){
            System.out.println("error: can't divide by zero");
        }
    }
}
