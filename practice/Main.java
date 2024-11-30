//ii)Inheritance 
// inheritance there are five types of inheritance 
// single multilevel Hierarchical
//single inheritance it single it inheritance one class to another class 
//using the  extends keyword
//examples
class A {
    void show()
    {
        System.out.println("show method run");

    }

}
class B extends A{
    void showB()
    {
        System.out.println("B method is run ");

    }

}
class Main {
    public static void main(String args[])
    {
        B kk=new B();
        kk.show();
        kk.showB();
        System.out.println("both method are single inheritance");
    }
}