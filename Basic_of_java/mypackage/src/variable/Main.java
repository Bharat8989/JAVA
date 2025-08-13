package variable;
class Main{
    int a=12;// global variable 
    static String name="Bharat";
    void show(){
        int c=23; // local variable
        System.out.println("this is global variable:"+a);
        System.out.println("this is local variable:"+c);
        System.out.println("this is static variable:"+name);
    }
    public static void main(String args[]){
        // System.out.println("this is global variable : second"+a);
        System.out.println("this is static variable second:"+name);
        Main a=new Main();
        a.show();
    }
}