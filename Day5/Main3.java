package Day5;

interface Validator{
    static boolean isValidPin(String pin){
        if(pin.length()!=4) return false;
        for(char c: pin.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }        
        return true;
    }
}
public class Main3 {
    public static void main(String[] args) {
        System.out.println(Validator.isValidPin("1234")); // true
        System.out.println(Validator.isValidPin("123"));  // false
        System.out.println(Validator.isValidPin("12a4")); // false
    }
}
