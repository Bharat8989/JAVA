// package Polymorphism;

// import Applet.Main;

class Main {
    public int add(int a, int b){
        return a+b ;
    }
    public int add(int a, int b ,int c)
    {
        return a+b+c;
    }
}
/**
 * Calculator
 */
public class Calculator {

    public static void main(String args[])
    {
        Main cal=new Main();
        int sum1=cal.add(12,25);
       int sum2= cal.add(12,25,35);
       System.out.println("sum of two nu ="+sum1);
       System.out.println("sum of three nu ="+sum2);
    }
}
