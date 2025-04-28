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
//default Constructor

//parameterize constructor
//constructor overloading

class Student {
    Student(){
        System.out.println("default constructor");

    }
    Student(String name){
        System.out.println("name:"+name);
    }
}
class Main1{
    public static void main(String args[]){
        Student s=new Student();
        Student s2=new Student("bharat");
    }
}