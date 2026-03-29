package practice;

interface Logger{
    default void logInfo(String msg){
        System.out.println("INFO: " + msg);
    }
    static void format(String msg){
        System.out.println("Formatted message: " + msg);
    }
}
class AppLogger implements Logger{
    public void logInfo(String msg) {
        System.out.println("AppLogger - INFO: " + msg);
    }
}
public class main4 {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.logInfo("This is an info message.");
        Logger.format("This is a formatted message.");
    }
}
