package JavaBase;
// // Leap Year Checker
// // Write a program to check whether a year is a leap year or not.

// // A year is a leap year if it is divisible by 4 but not divisible by 100, except if it is divisible by 400.

// import java.util.Scanner;
// class LeapYear{
//     public static void main(String[] args) {
//         Scanner S=new Scanner(System.in);
//         System.out.println("enter any year:");
//         int year=S.nextInt();
//         if(year%4==0 && year%100 !=0 || year%400==0){
//             System.out.println("this "+year +" is leap");
//         }
//         else{
//             System.out.println("this "+year +" is not leap year");
//         }
//     }
// }

// // leap year 
/**
 * LeapYear
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        
        System.out.println("enter any year:");
        int year=S.nextInt();
        if(year%4==0 && year%100 != 0 || year%400==0){
           System.out.println("it is leap " + year + " year");
        }
        else{
            System.out.println("it is not " + year + "year");
        }
    }

    
}