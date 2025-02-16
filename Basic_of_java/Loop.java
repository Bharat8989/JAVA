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
    int reversed=0;
    int original=n;

    while(n>0){
        reversed=reversed*10+n%10;
        n=n/10;


    }
    if(original==reversed){
        System.out.println(original+" is a palindrome");
    }
    else{
        System.out.println(original+" is not a palindrome");
    }

   
    
}

}