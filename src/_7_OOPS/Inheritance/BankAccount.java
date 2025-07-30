package _7_OOPS.Inheritance;

public class BankAccount {
    int CustomerId;
    int accNumber;
    double balance;
    String AccHolderName;

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public double CheckBalance(){
        return balance;
    }
}
