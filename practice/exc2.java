package practice;

public class exc2 {
    public static void main(String[] args) {
        int arr[]={1,4,8};
        try{
            System.out.println(arr[2]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index outta range");
        }
    }
}
