package Array;
import java.util.Scanner;
public class Main {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int marks[]=new int[n];

    int sum=0;
    double avg;

    System.out.println("enter " +n+ " elements:");
    for(int i=0;i<n;i++){
        marks[i]=sc.nextInt();

      
       
    }
    System.out.println("array elements:");
    for(int i=0;i<n;i++){
        System.out.println(marks[i]);
        sum=sum+marks[i];
    }

     System.out.println("sum of array values :"+sum);
     avg=(double) sum/n;
     System.out.println("average marks:"+avg);
   }
}
