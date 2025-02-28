
package Basic_of_java;

import java.util.Scanner;

class Main1{
    public static void main (String [] args)
    {
        Scanner sc =new Scanner(System.in);
        
        
        System.out.println("enter the you name:");
        String Char=sc.nextLine();

        String Uppercase=Char.toUpperCase();
        String LowerCase=Char.toLowerCase();
        int length=Char.length();
        boolean containsJava=Char.contains("java");
        

        System.out.println(Uppercase);
        System.out.println(LowerCase);
        System.out.println(length);
        System.out.println(containsJava);
      
    }
}