class MyThread extends Thread{
    public void run(){
        System.out.println("Thread in running ");
    }
}
class ThreadExample {
    public static void main (String args[])
    {
        MyThread my=new MyThread();
        my.start();
    }
}