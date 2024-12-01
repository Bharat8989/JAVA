// constructor
// there are two types of constructor i)default constructor ii)no parameter constructor ii)parameterize constructor 
// same name as the class name 
// constructor is no return vales 
class Main {
    int a;
    String name;
    // no parameter constructor
    Main(int age,String b)
    {
        System.out.println("no parameter constructor");
    }
    public static void main (String args[])
    {
        Main kk=new Main(10,"bharat");
        System.out.println("the vale of a:"+kk.a  + " and your name is:"+kk.name);
    }
}