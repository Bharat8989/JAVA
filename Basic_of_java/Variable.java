package Basic_of_java;
//even or odd number 

import java.util.Scanner;

class Variable {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the values:" );
      int a=sc.nextInt();
      if(a % 2==0){
         System.out.println("it is even number ");

      }
      else {
         System.out.println("not a even number ");
      }

   }
}