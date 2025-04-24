/* Abstractions
 * hiding internal details and showing only essentials
 * Abstractions is achieved using 
 */
abstract class Animal {
    abstract void sound();
    void sleep()
    {
        System.out.println("animal sleeps");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class Abstraction{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.sleep();
        d.sound();
    }
}
