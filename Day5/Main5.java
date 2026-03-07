package Day5;

interface LoginService {
    boolean login(String user, String pass);
}
interface NotificationService {
    void sendEmail(String msg);
    void sendSMS(String msg);
}
interface ReportService {
    void generateReport();
}
class AdminPanel implements LoginService, NotificationService, ReportService {
    public boolean login(String user, String pass) {
        if(user.equals("admin") && pass.equals("1234")) {
            return true;
        }
        return false;
    }
    public void sendEmail(String msg) {
        System.out.println("Email sent: " + msg);
    }
    public void sendSMS(String msg) {
        System.out.println("SMS sent: " + msg);
    }
    public void generateReport() {
        System.out.println("Admin report generated.");
    }
}
public class Main5 {
    public static void main(String[] args) {
        AdminPanel admin = new AdminPanel();
        LoginService loginRef = admin;
        boolean status = loginRef.login("admin","1234");
        if(status) {
            System.out.println("Login Successful");
            ReportService reportRef = admin;
            reportRef.generateReport();
            NotificationService notifyRef = admin;
            notifyRef.sendEmail("Report ready");
            notifyRef.sendSMS("Report generated successfully");
        } else {
            System.out.println("Login Failed");
        }
        boolean fail = loginRef.login("admin","0000");
        if(!fail)
            System.out.println("Login Failed (Wrong password)");
    }
}
