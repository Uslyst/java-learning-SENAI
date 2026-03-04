package aula4.exercicio02;
import aula4.exercicio02.entities.CheckingAccount;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide the account name: ");
        String name = scanner.nextLine();

        System.out.print("Provide the account number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        CheckingAccount ca = new CheckingAccount(name, num);

        boolean quit = false;

        while(!quit) {
            ca.printAccount();

            System.out.print("\n1. Deposit \n2. Withdraw \n3. Quit \n:");
            
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.print("Deposit amount: ");
                    double dAmount = scanner.nextDouble();
                    ca.deposit(dAmount);
                    break;
                case 2:
                    System.out.print("Withdraw amount: ");
                    double wAmount = scanner.nextDouble();
                    ca.withDraw(wAmount);
                    break;
                default:
                    quit = true;
                    break;
            }
        }
        scanner.close();
    } 
}