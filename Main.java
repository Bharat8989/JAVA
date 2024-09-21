

// import java.util.Scanner;
// class Main{
//     public static void main (String args[])
//     {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your Name:");
//        String name=scanner.next();
//        System.out.println("enter your age:");
//        int age=scanner.nextInt();
//        System.out.println("enter your gender:");
//        char gender=scanner.next().charAt(0);
//        System.out.println("enter your phone number:");
//        long number=scanner.nextLong();
//        System.out.println("enter your email id:");
//        String email=scanner.next();
//        System.out.println("enter your roll Number:");
//        int roll=scanner.nextInt();


//        System.out.println("\n\n\n");
//        System.out.println("Name:"+name);
//        System.out.println("Age:"+age);
//        System.out.println("Gender:"+gender);
//        System.out.println("Mobile Number:"+number);
//        System.out.println("Email:"+email);
//        System.out.println("Roll Number:"+roll);

//     }
// }

import java.util.Scanner;
/**
 * Main
 */
public class Main {

    public static void main (String [] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=S.next();
        System.out.println("enter your age:");
        int age=S.nextInt();
        System.out.println("enter your phone number:");
        long number=S.nextLong();
        System.out.println("enter your Gender:");
        char gender=S.next().charAt(0);
        System.out.println("enter your email id:");
        String email=S.next();
        System.out.println("enter your collage name:");
        String collageName=S.next();


        System.out.println("your output hare !!!!!!!!!!!!");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("phone number:"+number);
        System.out.println("Gender:"+gender);
        System.out.println("Email ID:"+email);
        System.out.println("collage Name:"+collageName);


    }
}




















