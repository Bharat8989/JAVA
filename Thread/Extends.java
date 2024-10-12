// create a thread by Extending the thread  thread class 

class MyThread extends Thread{

    public void run(){
        System.out.println("  run a method run");
    }
}
class Extends {
    public static void main (String args[])
    {
        MyThread k=new MyThread();
        k.start();
    }
}