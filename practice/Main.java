//Hierarchical inheritance 

class A {
    public void showA()
    {
        System.out.println( "A method run ");

    }
}
class B extends A{
    public void showB(){
        System.out.println("B method run");

    }
} 
class C extends A{
     public void ShowC()
     {
        System.out.println("C method run");
     }
    // System.out.println("main method run");

}
class Main 
{
    public static void main(String args[])
    {
        C kk=new C();
        kk.showA();
        // kk.showB();
        kk.ShowC();
        B kkk=new B();
        System.out.println("call the B method ");
        kkk.showA();
        kkk.showB();
    }
}