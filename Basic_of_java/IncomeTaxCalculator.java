package Basic_of_java;

import java.util.Scanner;
class Main1 {
    //check divisibility by 5 and 3

    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);


        System.out.println("enter any number:");
        int num=sc.nextInt();
        //nested if
        if(num %5 ==0){
            System.out.println("The number is divisible by 5");

            if(num % 3 ==0){
                System.out.println("The number is also divisible by 3");

            }
            else{
                System.out.println("but is not divisible by 3");

            }

        }
        else{
            System.out.println("The number is not divisible by 5");
            
        }

    }
}