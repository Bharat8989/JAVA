/* 1 Inheritance
 * 2 Multi-level Inheritance
 * 3 Hierarchical Inheritance
 * 4 Hybrid inheritances
 * 5 multiple inheritances
 * 
 */
interface A{
    void showA();

} 
interface B
{
    void showB();
}
class C implements A, B{
    public void showA(){
        System.out.println("show A method run ");
    }
   public void showB(){
        System.out.println("show B method run ");
    }
}
class Main {
    public static void main (String args[])
    {
        C b=new C();
        b.showA();
       
        b.showB();
    }
}

