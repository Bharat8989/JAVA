class A{
    void showA()
    {
        System.out.println("show A method run");
    }
}
class B extends A{
    void showB()
    {
        System.out.println("show B method run");
    }
}
class C extends B{
    void showC()
    {
        System.out.println("show C method run");
    }
}
class D extends C{
    void showD()
    {
        System.out.println("show D method run");
    }
}
class Multilevel {
    public static void main(String args[])
    {
        D sh=new D();
        sh.showA();
        sh.showB();
        sh.showC();
        sh.showD();
        System.out.println("multilevel method show");
    }
}