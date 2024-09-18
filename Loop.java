// three types of loop 1 for loop 2 while loop 3 do while loop
public class Loop {

    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        int a=11;
        while (a<=20) {
            System.out.println(a);
            a++;
        }
        int c=21;
        do{
            System.out.println(c); 
            c++;
        }
        while(c<=30);
        
    // }

// Sum of First N Numbers: Write a loop to find the sum of the first N natural number.
        
          int sum=0;
          for(int k=0;k<=10;k++)
          {
            sum =sum+k;
            
          }
          System.out.println("total:"  +sum);

          for(int m=0;m<=40;m++){
            if(m%2==0){
                System.out.println(m);
            }
          }
// Reverse Counting: Write a loop that prints numbers from 100 to 1 in reverse order.
    
          for(int d=10;d>=0;d--){
            System.out.println(d);
          }
        //   Sum of Digits: Write a loop to calculate the sum of digits of a given number.

        // Pattern Printing: Use nested loops to print the following pattern:
        int rows = 5; // Number of rows in the pattern

        for (int l = 1; l <= rows; l++) {
            for (int ll = 1; ll <= l; ll++) {
                System.out.print("*"); //
            }
            System.out.println(); 
        }

}} 
// loop statement 