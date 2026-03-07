package Day2;
//Create a Mobile class with brand, model, price.
// ● Default constructor sets “Unknown”
// ● Parameterized constructor sets real values
// Hint: Two constructors with different parameter lists.
public class Mobile {
    String brand;
    String model;
    float price;
    Mobile() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0f;
    }
    Mobile(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public static void main(String[] args) {
        Mobile c1 =new Mobile("Samsung","Zflod3", 149999);
        System.out.println("Brand: " + c1.brand);
        System.out.println("Model: " + c1.model);
        System.out.println("Price: " + c1.price);
    }
}
