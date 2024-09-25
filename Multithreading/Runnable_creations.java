class Mythread extends Thread
{
    public void run(){

        System.out.println("thread class run ");
    }
} 
class MyRunnable implements Runnable
{
    public void run(){
        System.out.println("runnable class run");

    }
}
// package Multithreading;

/**
 * Runnable_creations
 */
public class Runnable_creations {

    public static void main(String args[])
    {
        Mythread thread1=new Mythread();
        MyRunnable myrunnable=new MyRunnable();
        Thread thread2=new Thread(myrunnable);
        thread1.start();
        thread2.start();

    }
}
