package Basic_of_java;
// import java.util.Arrays;

class Array{
    public static void main(String args[])
    {
        int number[]={10,120,30,40};
     
        // System.out.println(Arrays.toString(number));

        int max=number[0];
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<max){
                max=number[i];
            }

        }
        System.out.println(max);
    }
}