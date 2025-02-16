package Basic_of_java;

import java.util.Scanner;

//while lop 
//do while loop
//for loop
class Loop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter any natural number:");
    int n=sc.nextInt();
       
    boolean isPrime=n>1;
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0){
           isPrime=false;
        }
       
    }
    if (isPrime) {
        System.out.println(n +" is a prime number");

        
    }
    else{
        System.out.println(n + " is not a prime number");
    }
}
}