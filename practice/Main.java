import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Name ,Roll , Mark and Grade");
        
        String name=sc.nextLine();
        int Roll=sc.nextInt();
        double Mark=sc.nextLong();
        char Grade=sc.next().charAt(0);



        System.out.println("name:"+name);
        System.out.println("roll:"+Roll);
        System.out.println("mark:"+Mark);
        System.out.println("grade:"+Grade);
    }
}