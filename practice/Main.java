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
  class A{
    public void showA()
    {
        System.out.println("A method run");
    }
  }
  class B extends A{
    public void showB()
    {
        System.out.println("B method run");
    }
  }
  class Main extends A{
    public static void main(String[] args) {
        Main kk=new Main();
        B kkkk=new B();
        kkkk.showB();
        kk.showA();
        // kk.showB();
    }
  }
