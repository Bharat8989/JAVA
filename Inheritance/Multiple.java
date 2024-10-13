interface A 
{
    void showA();
}
interface B {
    void showB();
}
class Dog implements A,B{

      public void showA(){
        System.out.println("showA method run ");

      }
     public void showB(){
        System.out.println("show b method run");
      }
}
/**
 * Multiple
 */
public class Multiple {

    public static void main(String args[])
    {
        Dog k=new Dog();
        k.showA();
        k.showB();
        System.out.println("print the multiple method run");
    }
}