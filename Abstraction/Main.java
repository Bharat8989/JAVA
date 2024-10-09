abstract class Animal{
    abstract void showA();

}
class Dog extends Animal{
    public void showA(){
        System.out.println("dog is barks");

    }

}
class Cat extends Animal{
    public void showA(){
        System.out.println("cat is running");
    }
}
class Main {
    public static void main(String args[])
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.showA();
        c.showA();
    }
}