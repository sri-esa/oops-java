package practice;

public class exc3 {
    public static void main(String[] args) {
        try{
            String s="sri";
            int num=Integer.parseInt(s);
            System.out.println(num);
        } catch(NumberFormatException e){
            System.out.println("invalid number format");
        }
    }
}
