package SuperKey;
 class A {
    int i=12;
}
class B extends A{
    int i=23;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
public class Main {
    public static void main(String args[]){
        B obj=new B();
        obj.show(12);
        
    }
}