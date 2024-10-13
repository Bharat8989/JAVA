//combinations of single and multiple inheritance
class A{
    void showA(){
        System.out.println("showA method run ");

    }
}
interface B{
    void showB();
}
class Hybrid extends A implements B{
    public void showB(){
        System.out.println("show B method run");
    }
    public static void main(String[] args) {
        
        Hybrid k=new Hybrid();
        k.showA();
        k.showB();
    }
}