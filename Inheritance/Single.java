package Inheritance;

// Single Inheritance:
// Problem: Create a class Animal with a method makeSound(). Derive another class Dog that overrides makeSound() to print "Bark". Create objects of both classes and call their makeSound() methods.


class Animal {
    void makeSound(){
        System.out.println("bark");
    }
}
class Single extends Animal{
    public static void main(String[] args) {
        Single main=new Single();
        main.makeSound();
    }
} 