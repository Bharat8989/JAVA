//  constructor there are three types of constructor 
// default constructor
// class Main {
//     int i;
//     String name;
//     public static void main(String args[])
//     {
//         Main kk=new Main();
//         System.out.println("  "+ kk.i + " "+kk.name);
//     }
// }

// no argument constructor
// public class Main {

//     Main(){
//         System.out.println("no argument constructor");
//     }
//     public static void main(String args[])
//     {
//         Main kk=new Main();

//     }
// }
// parameter constructor
public class Main {

    Main(int a)
    {
        System.out.println("it is parameter constructor");

    }
    public static void main(String args[])
{
    Main kk=new Main(10);
}
}