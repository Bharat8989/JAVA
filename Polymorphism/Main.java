// // Polymorphism is of two types:
// Compile time polymorphism
// Run time polymorphism
// compile time polymorphism is the same name but diff parameter with class 
// compile time polymorphism is also called as static poly
// run time polymorphism is the same name but diff class with same parameter 

// class Main {
//     public int add(int a, int b)
//     {
//         return a+b;
//     }
//     public int add(int a,int b,int c)
//     {
//         return a+b+c;
//     }
//     public static void main(String args[])
//     {
//         Main kk=new Main();
//         System.out.println("add two number:"+ kk.add(23, 27));
//          System.out.println("add three numbers:"+ kk.add(10, 20, 30));
//     }
// }

// run time polymorphism
// same name but diff class and same parameter

// import JavaBase.Main;

class Main1 {
    public int  add(int a, int b)
    {
        return a+b;
    }
}
class Main extends Main1{
    public int  add(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Main kk=new Main();
       System.out.println("add of 1st :"+ kk.add(10, 20));
       System.out.println("add ot 2nd :"+ kk.add(20, 30));
    }
}

