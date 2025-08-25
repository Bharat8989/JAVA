package Polymorphism;
//compile time polymorphism it also know as the overloading 
//same name as with same class but different parameters 

 class Cal  {
    void showA(){
        System.out.println("run show A method ");
    }
    void showA(int a){
        System.out.println(a);
    }
    
}
public class Main {

    public static void main(String args[]){
        Cal obj=new Cal();
        obj.showA();
        obj.showA(23);
    }
}
