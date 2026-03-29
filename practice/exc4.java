package practice;

public class exc4 {
    public static void main(String[] args) {
        try{
            int a=6/0;
        } catch(ArithmeticException e){
            System.out.println("error");
        } finally{
            System.out.println("always executes");
        }
    }
}
