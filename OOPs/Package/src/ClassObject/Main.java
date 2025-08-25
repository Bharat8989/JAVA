//inheritances 
//single inheritances 
package ClassObject;
class Parent {
    void ParentClass(){
        System.out.println("this is parent class");
    }
}
class Child extends Parent{
    void ChildClass(){
        System.out.println("this is child class");
    }
}
public class Main {

    public static void main(String args[]){
        Child obj=new Child();
        obj.ParentClass();
        obj.ChildClass();

        Parent obj1=new Parent();
        obj1.ParentClass();
    }
}