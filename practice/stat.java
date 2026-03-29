package practice;
// Create a class Test with:
// ● Non-static variable x
// ● Static variable y
// ● Static method show()
// Inside show() try accessing both variables.
// Explain what error occurs and how to fix it.
// 🔹 Hint
// ● Static methods cannot directly access non-static variables.
// ● You must create an object to access x.
public class stat {
    int x = 10; // Non-static variable
    static int y = 20; // Static variable

    static void show() {
        // System.out.println(x); // This will cause an error
        System.out.println(y); // This is fine

        // To access x, we need to create an object of the class
        stat obj = new stat();
        System.out.println(obj.x); // Now we can access x through the object
    }

    public static void main(String[] args) {
        show();
    }
}

