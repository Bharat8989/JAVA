package Inheritance;
// package Inheritance;

// package Inheritance;

// package Inheritance;


// package Inheritance;
// Single Inheritance:
// Problem: Create a class Animal with a method makeSound(). Derive another class Dog that overrides makeSound() to print "Bark". Create objects of both classes and call their makeSound() methods.


class Animal {
    void makeSound(){
        System.out.println("bark");
    }
}
public class Single extends Animal{
    public static void main(final String[] args) {
        final Single obj =new Single();
        obj.makeSound();
    }
} 