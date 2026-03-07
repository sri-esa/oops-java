package Day5;

interface Camera{
    default void Start(){
        System.out.println("Camera Starting...");
    }
    default void Stop(){
        System.out.println("Camera Stopping...");
    }
}
interface MusicPlayer{
    default void Start(){
        System.out.println("Music Player Starting...");
    }
    default void Stop(){
        System.out.println("Music Player Stopping...");
    }
}
class Smartphone implements Camera, MusicPlayer{
    public void Start(){
        System.out.println("Smartphone is starting all modules...");
        Camera.super.Start();
        MusicPlayer.super.Start();
    }
    public void Stop(){
        System.out.println("Smartphone is stopping all modules...");
        Camera.super.Stop();
        MusicPlayer.super.Stop();
    }
}
public class Main4 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.Start();
        smartphone.Stop();
    }
}
