// oops stand for object oriented programming language 
// i)class and object 
// class is blueprint or template
class Main
{
    String name ="bharat";
    int age =20;

    static void show(){
        System.out.println("static method without call the run ");
    }

    public static void main (String args[])
    {
        System.out.println("Main method is call");
        Main k=new Main();
        System.out.println("your name is :"+k.name);
        System.out.println("your age is:"+k.age);
        show(); // not using the main method
        
    }
}