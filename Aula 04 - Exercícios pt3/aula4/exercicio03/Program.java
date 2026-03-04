package aula4.exercicio03;
import aula4.exercicio03.entities.InvestmentAccount;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        InvestmentAccount ia = new InvestmentAccount("Investiment account", 1);
        ia.deposit(1000);
        ia.addInterestPercentage(10);
        ia.printAccount();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. \nAdd interest percentage: ", i);
            double amt = scanner.nextDouble();
            scanner.nextLine();
            ia.addInterestPercentage(amt);
        }

        ia.printAccount();
        
    } 
}