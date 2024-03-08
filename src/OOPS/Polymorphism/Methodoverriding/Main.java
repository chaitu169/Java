package OOPS.Polymorphism.Methodoverriding;

public class Main {
    public static void main(String[] args){
        Account a = new SavingsAccount();
        Account b = new FixedDepositAccount();
        Account c = new Account();

        System.out.println(a.interestRate());
        System.out.println(b.interestRate());
        System.out.println(c.interestRate());

        System.out.println("Hello world");
    }
}