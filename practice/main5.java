package practice;

interface Camera{
    default void start(){
        System.out.println("camera is starting...");
    }
}
interface MusicPlayer{
    default void start(){
        System.out.println("Music is playing...");
    }
}
class SmartPhone implements Camera,MusicPlayer{
    public void start(){
        System.out.println("Smartphone is staring camera and music...");
        Camera.super.start();
        MusicPlayer.super.start();
    }
}
public class main5 {
    public static void main(String[] args) {
        SmartPhone s=new SmartPhone();
        s.start();
    }
}
