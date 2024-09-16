

import java.util.Scanner;
class Main{
    public static void main (String args[])
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter your Name:");
       String name=scanner.next();
       System.out.println("enter your age:");
       int age=scanner.nextInt();
       System.out.println("enter your gender:");
       char gender=scanner.next().charAt(0);
       System.out.println("enter your phone number:");
       long number=scanner.nextLong();
       System.out.println("enter your email id:");
       String email=scanner.next();
       System.out.println("enter your roll Number:");
       int roll=scanner.nextInt();


       System.out.println("\n\n\n");
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("Gender:"+gender);
       System.out.println("Mobile Number:"+number);
       System.out.println("Email:"+email);
       System.out.println("Roll Number:"+roll);

    }
}