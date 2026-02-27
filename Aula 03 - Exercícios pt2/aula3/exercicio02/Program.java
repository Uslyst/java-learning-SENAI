package aula3.exercicio02;
import aula3.exercicio02.entities.Monkey;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a name to the first monkey: ");
        Monkey monkee1 = new Monkey(scanner.nextLine());

        System.out.print("Give a name to the second monkey: ");
        Monkey monkee2 = new Monkey(scanner.nextLine());

        while (true) {                 
            printMenu(monkee1, monkee2);
            
            try {
                int option = scanner.nextInt();
                scanner.nextLine();

                switch(option) {
                    case 1:
                        feedOption(scanner, monkee1, monkee2);
                        break;
                    case 2:
                        feedOption(scanner, monkee2, monkee1);            
                        break;
                    case 3:
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.print("\nInvalid option!");
                        continue;
                }
               
                if(monkee1.getIsAlive() && monkee2.getIsAlive()) {
                    if(monkee1.willCommitCanibalism()) {
                        monkee1.feed(monkee2.getName(), 100);
                        monkee2.kill();
                    } else if(monkee2.willCommitCanibalism()) {
                        monkee2.feed(monkee1.getName(), 100);
                        monkee1.kill();
                    }
                }

            } catch(InputMismatchException e) {
                scanner.nextLine();
            } catch(Exception e) {
                System.out.print("ERROR: " + e.getMessage());
                break;      
            }   
        }  
        scanner.close();
    } 

    private static void feedOption(Scanner scanner, Monkey monkey1, Monkey monkey2) {
        if(!monkey1.getIsAlive()) {
            return;
        }

        System.out.print("Food name: ");
        String food = scanner.nextLine();

        monkey1.feed(food, 15);
        monkey2.increaseHunger();
    }

    private static void printMenu(Monkey monkey1, Monkey monkey2) {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        monkey1.showStatus();
        System.out.print("\n");
        monkey2.showStatus();

        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.printf("\n1. Feed %s \n2. Feed %s \n3. Quit", monkey1.getName(), monkey2.getName());
        System.out.print("\n: ");
    }

}