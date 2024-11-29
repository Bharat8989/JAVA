// control statement 
//there are two types of control statement i)looping statement ii)conditional statement 
// i)for loop statement 
// ii)while loop 
// examples
class Main{
    void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        
    }
    void whileLoop()
    {
        int j=1;
        while(j<=6){
        System.out.println(j);
        j++;
    }
    void doWhileLoop(){
        int k=20;
        do{
           
            System.out.println(k);
            k++;
        }
        while(k <=30);
    }
    }
    public static void main(String args[])
        {
            Main k=new Main();
            k.run();
            k.whileLoop();
            k.dowhileLoop();
            System.out.println("hello Main class ");
        }
}