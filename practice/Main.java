// conditional statement 
// if if else if else if and last is the nested if 

class Main {
    void ifElse(){
        int age=18;
        if(age<=8)
        {
            System.out.println("you are the  voting  ");
        }
        else{
            System.out.println("your are not voting ");
        }
    }
    public static void main (String args[])
    {
        Main ifelse=new Main();
        ifelse.ifElse();
        int a=20;
        int b=20;
        if(a==b)
        {
            System.out.println("a and b both are equal");
        }
    }
}