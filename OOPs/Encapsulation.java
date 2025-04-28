/* Encapsulation
 * Wrapping data and method into a single unit 
 * it helps protect data by
 * making variable private 
 * using getters and setter to access them
 * 
 */
 class Student {
    private int age;
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }

 }
 class Encapsulation{
    public static void main(String args[])
    {
        Student s=new Student();
        s.setAge(23);
        System.out.println(s.getAge());
    }
 }