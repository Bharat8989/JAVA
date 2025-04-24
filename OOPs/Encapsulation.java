/* Encapsulation
 * Wrapping data and method into a single unit 
 * it helps protect data by
 * making variable private 
 * using getters and setter to access them
 * 
 */
 
class Student {
    private int rollNo;
     void setRoll(int r){
        rollNo=r;
    }
     int getRoll(){
        return rollNo;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Student s=new Student();
        s.setRoll(23);
        System.out.println("roll number:"+s.getRoll());
    }
}