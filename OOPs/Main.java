//types of inheritance in java 
//one class inheritance to another class 
//single one child class inheritance form one parent class 
//multilevel a class inherits form a class which itself is inherited 
// hierarchical  inheritance multiple class inherits form a single parent class 

//multiple inheritance (via interface ) a class implements multiple interface 
//hybrid inheritance :combination of two or more types multiple and single inheritance

interface A{
    void showA();

}
interface B{
    void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("show a method ");
    }
    public void showB(){
        System.out.println("show b method");
    }
}
class D extends C{
    void showD(){
        System.out.println("show d Method ");
    }
}
public class Main {
    public static void main (String args[]){
        D obj=new D();
        obj.showA();
        obj.showB();
        obj.showD();
    }
}