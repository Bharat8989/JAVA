class Object {
    int a;
    String name;
    void set(int i , String j)
    {
        a=i;
        name=j;
    }
    void get()
    {
        System.out.println("age is:"+a);
        System.out.println("your name is:"+name);

    }
    public static void main(String args[])
    {
        Object print=new Object();
        print.set(12, "Bharat");
        print.get();
        
    }
}