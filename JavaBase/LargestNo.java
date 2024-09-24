package JavaBase;
// write a program to find the largest number Between two give number

import java.util.Scanner;
public class LargestNo{
    public static void main(String args[])
    {
        // int a;
        Scanner S=new Scanner(System.in);
        System.out.println("value one enter:");
        float num1=S.nextInt();
        System.out.println("value two enter:");
        float num2=S.nextInt();
        if(num1>num2){
            System.out.println("num1 is big");
        }
        else{
            System.out.println("num 2 is big");
        }

    }
}