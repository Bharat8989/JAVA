//polymorphism 
/* same name ,different behavior polymorphism come form greek world poly manes many and morph forms
 * there are two types of polymorphism.
 * compile time polymorphism (it is know as method overloading )
 * same method name ,different number or types of parameters.
 * 
 */
//same name but different parameter
//run time polymorphism (method overriding )

class Animal{
    void sound(){
        System.out.println("animal method call");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class Main {
    public static void main(String args[])
    {
        Animal a=new Dog();
        a.sound();//out put is dog barks
        // a=new Animal();
        a.sound();
    }
}