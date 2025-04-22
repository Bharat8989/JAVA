//write a program to check if a number is prime using a for loop
class Main
{
    public static void main(String[] args) 
    {

        int num=13;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<num;i++){
                if(num % i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " this is not prime number");
        }
    }
}