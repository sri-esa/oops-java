package practice;

interface Printable{
    void print();
    void scan();
}
class Printer implements Printable{
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}
public class main3 {
    public static void main(String[] args){
        Printer p=new Printer();
        p.print();
        p.scan();
    }
}
