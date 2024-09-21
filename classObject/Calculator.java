package classObject;

public class Calculator {
    // write a class Calculator with methods for adding ,subtraction ,multiplying,and dividing two numbers;
    int a=20;
    float b=12;
    void adding(){
        System.out.println("add of two number:"+(a+b));
    }
    void sub()
    {
        System.out.println("subtractions of two number:"+(a-b));

    }
    void multiplying()
    {
        System.out.println("Multiplying of two number:"+(a*b));

    }
    void dividing()
    {
        System.out.println("diving of two number:"+(a/b));
    }
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.adding();
        cal.sub();
        cal.multiplying();
        cal.dividing();
    }
}
