package Day1;
class checknum{
    int n;
    void check(){
    if(n>0){
        System.out.println(n + " is a Positive number.");
    } else if(n<0){
        System.out.println(n + " is a Negative number.");
    } else{
        System.out.println("The number is Zero.");
    }
    if(n%2==0){
        System.out.println(n + " is an Even number.");
    } else{
        System.out.println(n + " is an Odd number.");
    }
    if(n%3==0){
        if(n%5==0){
            System.out.println(n + " is divisible by both 3 and 5.");
        } else{
            System.out.println(n + " is divisible by 3 only");
        }
    } else if(n%5==0){
        System.out.println(n + " is divisible by 5 only");
    } else{
        System.out.println(n + " is not divisible by either 3 or 5.");
    }
}
}
public class NumberTool {
    public static void main(String[] args){
        checknum number=new checknum();
        number.n=15;
        number.check();
    }
}
