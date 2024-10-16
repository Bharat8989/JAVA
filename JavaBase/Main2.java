import java.util.Scanner;
// import java.util.Scanner;

public class Main2 
{
    public static void main (String args[])
    {
         Scanner k=new Scanner(System.in);
         System.out.println("enter your name:");
         String Name=k.next();
         System.out.println("enter your age:");
         int Age=k.nextInt();
         System.out.println("enter your Gender:");
         char Gender=k.next().charAt(0);
         System.out.println("enter your Email:");
         String Email=k.next();
         System.out.println("enter your collage Name:");
         String CollageName=k.next();
         System.out.println("enter your Phone Number:");
         long Mobile =k.nextLong();
         
         System.out.println("your out put here !!!!!!");

         System.out.println("Name:"+Name);
         System.out.println("Age:"+Age);
         System.out.println("Gender :"+Gender);
         System.out.println("Email:"+Email);
         System.out.println("Collage Name:"+CollageName);
         System.out.println("Phone Number:"+Mobile);

    }
}