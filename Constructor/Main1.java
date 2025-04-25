 /* Constructor
 * Constructor name =class name
 * it has no return type 
 * it runs automatically when the object is create.
 * 1 default Constructor
 * a Constructor with no parameters
 * java provides it automatically if you don't define any Constructor
 * 
 * 2  Parameterized Constructor
 * a constructor that accepts arguments to initialize object variables
 */
// class Student{
//     Student(){
//         System.out.println("default Constructor");
//     }
// }
// class Main {
//     public static void main(String args[])
//     {
//         Student s=new Student();
//     }
// }
class Student12
{
    String name;
        int roll;
    Student12(String n,int a)
    {
        name=n;
        roll=a;

    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("roll:"+roll);
    }

}
class Main1{
    public static void main(String args[])
    {
        Student12 s=new Student12("bharat",34);
        s.display();
    }
}