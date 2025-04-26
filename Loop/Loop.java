// class Loop{
//     public static void main(String args[]){
//       //star patter questions 
//      for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(i+"  ");
//         }
//         System.out.println(" ");
//      }
      
       
//     }
// }
class Loop{
    public static void main(String args[])
    {
        int year=2021;
        if((year%4==0 && year%100 !=0) || year % 400==0){
            System.out.println(year+" this is leap year");
        }
        else{
            System.out.println(year+" this is not leap year");
        }
    }
}