// Class definition (blueprint)
class Car {
    String brand;
    int year;
}

public class Main {
    public static void main(String[] args) {
        // Creating objects from class
        Car car1 = new Car();  // Object 1
        car1.brand = "Toyota";
        car1.year = 2020;

        Car car2 = new Car();  // Object 2
        car2.brand = "Honda";
        car2.year = 2022;

        // Accessing data through objects
        System.out.println("Car 1: " + car1.brand + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.year);
    }
}
