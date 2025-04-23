public class DelayedPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Number: " + i);
           try {
            Thread.sleep(10000);
           } catch (Exception e) {
           
            System.out.println("not correct this ");
           }
        }
    }
}
