package aula4.exercicio03.entities;

public class InvestmentAccount {
    private double balance = 0;
    private String name;
    private int accountNum;
    private double interestRate;

    public InvestmentAccount(String name, int accountNum) {
        this.name = name;
        this.accountNum = accountNum;
    }

    public void addInterestPercentage(double amount) {
        interestRate += amount;
        updateBalanceInterest();
    }

    private void updateBalanceInterest() {
        double interestRateDecimal = interestRate / 100;

        double interest = balance * interestRateDecimal;
        
        balance += interest;
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
        System.out.printf("\ninterest Rate: %.2f%%", interestRate);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
