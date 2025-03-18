package Basic_of_java;

class Binary {
    void BinaryNumber(int num){
        int pos=1;
        int ans=0;
        // int num;
        while ( num > 0) {

           int  rem=num%10;
        //    num=num/2;
            num=num/10;
           ans=ans+rem * pos;
           
           pos=pos * 2;

        }
        System.out.println("binary number:" +ans);
    }
    public static void main (String args[])
    {
        Binary obj=new Binary();
        obj.BinaryNumber(1001);
    }
}
