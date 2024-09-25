// package Multithreading;
class Animal extends Thread {
     public void run(){
        System.out.println("run method show");
     }
}
/**
 * Thread_Creations
 */
public class Thread_Creations {

    public static void main (String args[]){
        Animal myThread =new Animal();
        myThread.start();

    }
} 