interface Animal{
    void showA();

}
class Dog implements Animal{
   public void showA(){
        System.out.println("dog is running");

    }
}
class Main {
    public static void main(String args[])

    {
        Dog k=new Dog();
        k.showA();
    }
}