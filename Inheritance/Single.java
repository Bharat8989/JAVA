// single inheritance 
// simple programs
class Animal
{
    void show()
    {
        System.out.println("show method run");

    }

}
class Dog extends Animal{
    void show2()
    {
        System.out.println("show2 method run");

    }
}
class Single{
    public static void main(String args[])
    {
        System.out.println("single method run");
        Dog king=new Dog();
        king.show();
        king.show2();

    }
}