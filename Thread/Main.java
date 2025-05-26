class Main {
    public static void main(String args[]){
        int rows=4;
        for(int i=1;i<=rows;i++){
            for(int space=1;space<=rows-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print(star+" ");
            }
            System.out.println();
        }
    }
}