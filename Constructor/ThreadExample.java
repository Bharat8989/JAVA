class MyThread extends Thread{
    public void run(){
        System.out.println("thread running ");
    }
}
class ThreadExample{
     public static void main(String args[])
    {
        MyThread t=new MyThread();
        // t.Show();
        t.start();
    }
    
}