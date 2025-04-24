interface A
{

    void show();
}
class Animal{
    void showA(){
        System.out.println("show A method call");
    }
}
class Cat extends Animal implements A{
    void showB(){
        System.out.println("show B method call");
    }
    public void show(){
        System.out.println("show interface method ");
    }
}
class Main {
    public static void main(String args[])
    {
        Cat c=new Cat();
        c.show();
        c.showA();
        c.showB();
    }
}
