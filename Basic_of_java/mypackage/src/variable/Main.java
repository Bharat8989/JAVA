package variable;
class Main{
    int a=10; //local variable 
    static char Char='A';//static variable 
    void show(){
        int b=12; // instant / global variable 
        System.out.println("sum of two number:"+ (a+b));
        System.out.println("charter of :"+Char);
    }
    public static void main(String args[]){
        Main s=new Main();
        s.show();
        System.out.println("the value of a:"+Char);
        // System.out.println(a);

    }
}