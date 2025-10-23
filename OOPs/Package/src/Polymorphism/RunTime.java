package Polymorphism;

// Parent Class
class Main {
    // Runtime polymorphism (Method Overriding)
    void show() {
        System.out.println("run the show Main method ");
    }
}

// Child Class 1 overriding show()
class Main1 extends Main {
    // same method as parent class
    void show() {
        System.out.println("run the Main 1 method ");
    }
}

// Child Class 2 overriding show()
class Main2 extends Main {
    // same method as parent class
    void show() {
        System.out.println("run the main 2 method ");
    }
}

// Driver Class
public class RunTime {
    public static void main(String[] args) {
        // Upcasting: Parent class reference → Child class object
        Main obj = new Main1();  // points to Main1 object
        Main obj1 = new Main2(); // points to Main2 object

        // Runtime decision: JVM checks actual object type
        obj.show();   // Calls Main1's show()
        obj1.show();  // Calls Main2's show()
    }
}
