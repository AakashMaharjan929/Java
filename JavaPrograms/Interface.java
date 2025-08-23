// Main class to test the implementation
public class Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}


// Define the first interface
interface Interface1 {
    void method1();
}

// Define the second interface
interface Interface2 {
    void method2();
}

// Implement both interfaces in a class
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

