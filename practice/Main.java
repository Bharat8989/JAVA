// 4th multi 

interface A {
    void run();

}
interface B
{
    void bark();
}
class Animal 
{
    void eat()
{
    System.out.println("animal class run");
}
} 
class Main extends Animal implements A, B{
    public void run(){
        System.out.println("A method run ");

    }
    public void bark()
    {
        System.out.println("B method run ");
    }
    public static void main(String args[])
    {
         Main kk=new Main();
         kk.run();
         kk.bark();
         kk.eat();
    }
}