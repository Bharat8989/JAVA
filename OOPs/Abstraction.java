/* Abstractions
 * hiding  details and showing only essentials
 * Abstractions is achieved using 
 */

 abstract class A{
    abstract void show();
    void showB(){
        System.out.println("show B method run ");
    }
 }
 class B extends A{
    public void show(){
        System.out.println("show method  ");
    }
 }
 class Abstraction {
    public static void main(String args[]){
    B b=new B();
    b.show();
    b.showB();
    }
 }