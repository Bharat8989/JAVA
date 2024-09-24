package JavaBase;
// Write a program to print the grade based on marks:

// 90 and above: A
// 80 to 89: B
// 70 to 79: C
// Below 70: Fail

public class GradeCalculator {
    public static void main(String args[])
    {
        int a=70;
        if(90<=a)
        {
            System.out.println("grade A");
        }
        else if(80<=a){
        System.out.println("grade B");
        }
        else if(70<=a){
            System.out.println("grade C");
        }
        else{
            System.out.println("fail");
        }


    }
    
}
