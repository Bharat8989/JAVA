class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Dog{
    void eat(int a){
        System.out.println("cat is eats for the food");
    }
}
public class Main {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.eat();   // Inherited method
        d.bark();  // Own method
        d.eat(23);
    }
}
