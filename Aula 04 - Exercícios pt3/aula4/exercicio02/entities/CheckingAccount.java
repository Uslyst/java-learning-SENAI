package aula4.exercicio02.entities;

public class CheckingAccount {
    private double balance = 0;
    private String name;
    private int accountNum;

    public CheckingAccount(String name, int accountNum) {
        this.name = name;
        this.accountNum = accountNum;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withDraw(double amount) {
        if(amount > balance){
            System.out.print("Insufficient funds");
            return 0;
        }

        balance -= amount;
        return amount;
    }

    public void printAccount() {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("\nName: %s", name);
        System.out.printf("\nAccount Num: %d", accountNum);
        System.out.printf("\nBalance: %.2f", balance);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
