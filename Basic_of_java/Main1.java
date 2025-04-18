package Basic_of_java;

import java.util.Scanner;

class Main1 
{
    public static void main (String args[])
    {
       //write a program to check whether a number is positive or negative
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any number:");
       int number=sc.nextInt();
       if(number >= 0){
        System.out.println(number+("  number is positive "));

       }
       else{
        System.out.println(number+ "number is negative");
       }
    }
}