// 
// Object & Class
// Inheritance
// Polymorphism
// Abstraction
// Encapsulation
/* inheritance there are main 3 types of i single ii)multiLever iii 
 * Single level
Multi-level
Hierarchical
Multiple
Hybrid
multiple and hybrid are both not using the in java 
it use to 
  */
//   single multiLever hierarchical
//   class A{
//     public void showA()
//     {
//         System.out.println("A method run");
//     }
//   }
//   class B extends A{
//     public void showB()
//     {
//         System.out.println("B method run");
//     }
//   }
//   class Main extends A{
//     public static void main(String[] args) {
//         Main kk=new Main();
//         B kkkk=new B();
//         kkkk.showB();
//         kk.showA();
//         // kk.showB();
//     }
//   }
// multiple 
// interface Animal{
//     void showA();
   
// }
// interface Dog{
//     void showB();
// }
// class Main implements Animal,Dog{
//     public void showA(){
//         System.out.println("show a method ");

//     }
//     public void showB(){
//         System.out.println("show b method");
//     }
//     public static void main(String args[]){
//     Main kk=new Main();
//     kk.showA();
//     kk.showB();
//     }
// }


// Polymorphism
// there are two types of polymorphism one is the compile time polymorphism second is the runtime polymorphism
// examples
// same name but different parameter
// class Main {
//     int add(int a ,int b)
//     {
//         return a+b;
//     }
//     int add(int a, int b ,int c)
//     {
//         return a+b+c;
//     }
//     public static void main(String args[])
//     {
//         Main kk=new Main();
//         kk.add(23, 27);
//         kk.add(10, 20, 30);
//         System.out.println("add of two number:"+kk.add());
//         System.out.println("add of three number:"+kk.add());
//     }
// }
// abstract
abstract class Animal{
    public abstract void showA();
}
class Main extends Animal{
    public void showA(){
        System.out.println("show a method for abstract method ");

    }
    public static void main (String args[])
    {
        Main kk=new Main();
        kk.showA();
    }
}