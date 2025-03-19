package Basic_of_java;

class Binary {
    void DecimalNumber1(int DecimalNumber)
    {
        int ans =0;
        int pos=1;
        while(DecimalNumber> 0)
        {
            int rem=DecimalNumber%2;
            DecimalNumber=DecimalNumber/2;
            ans=ans+ (rem * pos);
            pos=pos*10;

        }
        System.out.println("Binary1Number:"+ans);
    }
    public static void main(String args[])
    {
        Binary obj=new Binary();
        obj.DecimalNumber1(10);
    }
}
