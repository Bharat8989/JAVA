// create the implementation of the Runnable interface
class MyThread extends Thread {
    public void run() {
        System.out.println("implements the void run method");
    }
}

// Implementing Runnable correctly
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("my runnable method run");
    }
}

class RunnableDemo {  
    public static void main(String args[]) {
        MyThread k = new MyThread();  
        MyRunnable myRunnable = new MyRunnable();  
        Thread thread = new Thread(myRunnable);  

        k.start();  
        thread.start(); 
    }
}
