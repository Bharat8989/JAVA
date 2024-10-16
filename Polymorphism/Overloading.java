class Cal {
    int add (int a,int b)
   {
       return a+b;
   }
    int add (int a)
   {
       return a;
   }
}
public class Main{
   public static void main(String[] args) {
       Cal k=new Cal();
      int single= k.add(34);
       int addSum=k.add(10, 20);
       System.out.println("value of a:"+single);
       System.out.println("value of a and b:"+addSum);
   }
}