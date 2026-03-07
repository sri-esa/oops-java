package Day2;

public class Car {
    String brand;
    int year;
    Car() {
        this.brand = "Unknown";
        this.year = 0;
    }
    Car(String brand) {
        this();
        this.brand = brand;
    }
    Car(String brand, int year) {
        this(brand);
        this.year = year;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020);
        System.out.println("Brand: " + c1.brand);
        System.out.println("Year: " + c1.year);
    }
}
