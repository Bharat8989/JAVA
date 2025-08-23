package Array.TwoDArray;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int students=3;
        int subjects=3;
        int marks[][]=new int[students][subjects];

        for(int i=0;i<students;i++){
            System.out.println("Enter marks for Student " +(i+1) +": ");
            for(int j=0;j<subjects;j++){
                marks[i][j]=sc.nextInt();
            }
           
        }
        for(int i=0;i<students;i++){
            int total=0;
            System.out.println("student " + (i+1)+ "Marks:");
            for(int j=0;j<subjects;j++){
                System.out.println(marks[i][j]+" ");
                total=total+marks[i][j];
            }
            System.out.println("Total="+total);
        }
    }
    
}
