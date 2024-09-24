package JavaBase;
/**
 * SwapNumber
 */
public class SwapNumber {

    public static void main(String[] args) {
        // int a=10,b=20,temp;
        // temp=a;
        // a=b;
        // b=temp;
        int a=34;
        int  b=23;
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}