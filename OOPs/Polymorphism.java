/* Polymorphism
 * same name , different behavior
 * two types of OVerloading and Overriding
 * compiler time same method name and different parameters
 * Run time (Overriding ) same method in subclass
 * 
 */
class Cat{
    void sound(){
        System.out.println("cat meows");
    }
}
class Dog extends Cat{
    void sound(){
        System.out.println("dog barks");

    }
}
class Print extends Cat {
    void sound(){
        System.out.println("print class show");
    }
}
class Polymorphism {
    public static void main(String args[])
    {
        Cat c;

        c = new Dog();
        c.sound();  // dog barks
        
        c = new Print();
        c.sound();  // print class show
        
    }
}