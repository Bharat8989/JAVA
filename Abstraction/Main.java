// abstractions 
// abstractions method run 
// abstract class Animal{
//      abstract void show();

// }
// class Main1 extends Animal{
//     public void show(){
//         System.out.println("show method run 11111111111");

//     }

// }
// class Main2 extends Animal{
//     public void show(){
//         System.out.println("show method run 222222222222");

//     }

// }
// public class Main {

//     public static void main(String args[])
//     {
//         Main1 kk=new Main1();
//         Main2 kkk=new Main2();
//         kk.show();
//         // kkk.show();
//     }
// }

// Abstractions method but using the interfaces

interface  Main1{
    void show();

}
class Main implements Main1{
    public void show(){
        System.out.println("the interface method run using the implement keyword");

    }
    public static void main(String[] args) {
        Main kk=new Main();
        kk.show();
    }
}