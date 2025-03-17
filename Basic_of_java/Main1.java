package Basic_of_java;
class Main1 {
    public static void main(String args[])
    {
        String s1 = "hello";
        String s2 = new String("hello");
        
        System.out.println(s1 == s2);      // false (Different memory references)
        System.out.println(s1.equals(s2)); // true (Same value)
        
    }
}