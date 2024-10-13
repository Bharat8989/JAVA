class A{
    void eat(){
        System.out.println("eat method run");

    }
}
class B extends A{
    void run()
    {
        System.out.println("run method run");

    }
}
class C extends A {
    void print()
    {
        System.out.println("print method run");

    }

}
class Hierarchical{
    public static void main(String args[]){
        C sh=new C();
        sh.eat();
        sh.print();
        B sh2=new B();
        sh2.run();
        sh2.eat();
        
        System.out.println("hierarchical method run");
    }
}