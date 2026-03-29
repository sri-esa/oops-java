package practice;

public class exec5 {
    public static void main(String[] args) {
        try{
            int arr[]=new int[3];
            arr[5]=23;
        } catch(ArithmeticException e){
            System.out.println("arithmetic error");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds error");
        }
    }
}
