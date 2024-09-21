package classObject;

public class Main1 {
    private String name;
    private int age;
    void set(String n,int a)
    {
        name= n;
        age=a;
    }
    void get()
    {
        System.out.println(" your name:"+name);
        System.out.println(" your age:"+age);
    }
    public static void main(String[] args) {
        Main1 k=new Main1();
        k.set("Bharat", 21);
        k.get();
    }
}
