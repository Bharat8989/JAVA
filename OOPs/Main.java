//types of inheritance in java 
//one class inheritance to another class 
//single one child class inheritance form one parent class 
//multilevel a class inherits form a class which itself is inherited 
// hierarchical  inheritance multiple class inherits form a single parent class 

//multiple inheritance (via interface ) a class implements multiple interface 
//hybrid inheritance :combination of two or more types multiple and single inheritance

//types of Polymorphism 
//compile time polymorphism :same method name with different parameters in the same class 

//runtime polymorphism (method overriding ) : subclass provide a specific 

class A {
    void show(){
        System.out.println("hello show A");
    }
}
class B extends A{
    void show(){
        System.out.println("hello show B");
    }
}
class Main {
    public static void main(String args[]){
       A obj=new B();
        obj.show();
    }
}