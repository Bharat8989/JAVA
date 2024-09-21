package classObject;

class ATM {
    int balance;

    ATM(int balanceAmount) {
        balance = balanceAmount;
    }

    void withdraw(int withdrawAmount) {
        if (withdrawAmount % 100 == 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;  // Deduct the withdrawn amount from the balance
            System.out.println("Transaction successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Transaction fails");
        }
    }

    public static void main(String[] args) {
        ATM am = new ATM(800000);
        am.withdraw(1000);  // Attempt to withdraw 1000
    }
}
