class pswrd{
    String username;
    String password;
    
    boolean validate(){
        boolean hasDigit=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='0' && ch<='9'){
                hasDigit=true;
                break;
            }
        }
        if(password.length()>=8 && hasDigit){
            return true;
        }
        return false;
    }
}
public class Login {
    public static void main(String[] args){
        pswrd user1=new pswrd();
        user1.username="user123";
        user1.password="passw0rd";
        if(user1.validate()){
            System.out.println("Login successful for " + user1.username);
        } else{
            System.out.println("Login failed for " + user1.username + ". Password must be at least 8 characters long and contain at least one digit.");
        }
    }
}
