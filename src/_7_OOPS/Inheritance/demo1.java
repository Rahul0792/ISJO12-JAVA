package _7_OOPS.Inheritance;

public class demo1 {
    public static void main(String[] args) {
        savingaccount savingaccount = new savingaccount();
        savingaccount.CustomerId = 101;
        savingaccount.accNumber=123456;
        savingaccount.balance=10000;
        savingaccount.AccHolderName= " =Rahul";

        savingaccount.withdraw(500);
        System.out.println(savingaccount.balance);

        savingaccount.deposit(600);
        System.out.println(savingaccount.balance);

    }
}
