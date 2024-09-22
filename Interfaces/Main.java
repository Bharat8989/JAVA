package Interfaces;  
interface A {
    void method1();  // Interface methods (no body)
    void method2();
}

class Main implements A {
    // Providing the implementation for method1
    public void method1() {
        System.out.println("method 1 call");
    }

    // Providing the implementation for method2
    public void method2() {
        System.out.println("method 2 call");
    }
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println("main method call");
        main.method1();
        main.method2();
    }


}

// class Main {
//     public static void main(String[] args) {
//         // Creating an instance of the Test class
//         Test test = new Test();
//         System.out.println("test method call");  // Extra print (optional)
        
//         // Calling the methods implemented from the interface
//         test.method1();
//         test.method2();
//     }
// }
