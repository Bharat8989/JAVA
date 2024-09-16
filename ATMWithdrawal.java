// Write a program that simulates an ATM, where a user enters the amount to withdraw. The program checks:

// The amount should be divisible by 100.
// The balance should be greater than or equal to the withdrawal amount.
public class ATMWithdrawal {
    public static void main(String[] args) {
        int amount=1000;
        int withdrawAmount=1000;
        if(withdrawAmount % 100== 0 &&  withdrawAmount <=amount )
        {
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Transaction fails");
        }
    }
}
