//single inheritance 
//one class inheritance to another class
class A{
    public void showA(){
        System.out.println("show a method call");
    }
}
class B extends A{
    public void showB(){
        System.out.println("show b method call");
    }
}
class Main {
    public static void main (String args[]){
        B b=new B();
        b.showA();
        b.showB();

        A a=new A();
        a.showA();
    }
}