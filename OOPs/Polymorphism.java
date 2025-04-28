/* Polymorphism
 * same name , different behavior
 * two types of OVerloading and Overriding
 * compiler time same method name and different parameters
 * Run time (Overriding ) same method in subclass
 * 
 */
class Math{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(double c,double d)
    {
        System.out.println(c+d);
    }
}
public class Polymorphism{
    public static void main (String args)
    {
        Math m=new Math();
        m.add(23, 43);
        m.add(250, 0256);
    }
}