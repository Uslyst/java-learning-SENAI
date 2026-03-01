package aula3.utils;
import aula3.exercicio04.entities.Food;
import aula3.exercicio04.entities.MonkeyWithFoodVectorStomach;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonkeyMenu {
    public static void menu(Scanner scanner, Object monkee1, Object monkee2) {
        boolean isMonkeyWithFoodVectorStomachMenu = 
        monkee1 instanceof MonkeyWithFoodVectorStomach &&
        monkee2 instanceof MonkeyWithFoodVectorStomach;
        
        MonkeyWithFoodVectorStomach foodVectorMonkey1 = isMonkeyWithFoodVectorStomachMenu ? (MonkeyWithFoodVectorStomach)monkee1 : null;
        MonkeyWithFoodVectorStomach foodVectorMonkey2 = isMonkeyWithFoodVectorStomachMenu ? (MonkeyWithFoodVectorStomach)monkee2 : null;
        
        while(true){            
            try {
                if(isMonkeyWithFoodVectorStomachMenu)      
                    printStatuses(foodVectorMonkey1, foodVectorMonkey2);                
                else {
                    printStatuses((MonkeyBase)monkee1, (MonkeyBase)monkee2);    
                } 

                int option = scanner.nextInt();
                scanner.nextLine();

                switch(option) {
                    case 1:
                        if(isMonkeyWithFoodVectorStomachMenu)                      
                            customFeedOption(scanner, foodVectorMonkey1, foodVectorMonkey2);
                        else 
                            basicFeedOption(scanner, (MonkeyBase)monkee1, (MonkeyBase)monkee2);                          
                        break;
                    case 2:
                        if(isMonkeyWithFoodVectorStomachMenu)                      
                            customFeedOption(scanner, foodVectorMonkey2, foodVectorMonkey1);
                        else 
                            basicFeedOption(scanner, (MonkeyBase)monkee2, (MonkeyBase)monkee1);                                
                        break;
                    case 3:
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.print("\nInvalid option!");
                        continue;
                }           
                MonkeyToolkit.tryCannibalism((MonkeyBase)monkee1, (MonkeyBase)monkee2);
                
            } catch(InputMismatchException e) {
                scanner.nextLine();
            } catch(Exception e) {
                System.out.print("ERROR: " + e.getMessage());
                break;      
            }           
        }
        scanner.close();
    }

    private static void customFeedOption(Scanner scanner, MonkeyWithFoodVectorStomach monkey1, MonkeyWithFoodVectorStomach monkey2) {
        if(!monkey1.getIsAlive()) {
            return;
        }

        System.out.print("Food name: ");
        String name = scanner.nextLine();

        System.out.print("Food kcal: ");
        double kcal = scanner.nextDouble();
        scanner.nextLine();

        Food food = new Food(name, kcal);

        monkey1.ingest(food);
        monkey2.increaseHunger();
    }

    private static void basicFeedOption(Scanner scanner, MonkeyBase monkey1, MonkeyBase monkey2) {
        if(!monkey1.getIsAlive()) {
            return;
        }

        System.out.print("Food name: ");
        String food = scanner.nextLine();

        monkey1.ingest(food, 15);
        monkey2.increaseHunger();
    }

    private static void printMenu(MonkeyBase monkey1, MonkeyBase monkey2) {
        System.out.printf("\n1. Feed %s \n2. Feed %s \n3. Quit", monkey1.getName(), monkey2.getName());
        System.out.print("\n: ");
    }

    private static void printSeparator() {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    private static void printStatuses(MonkeyBase monkey1, MonkeyBase monkey2) {       
        printSeparator();
        MonkeyToolkit.printStatus(monkey1);
        System.out.print("\n");
        MonkeyToolkit.printStatus(monkey2);     
        printSeparator();     
        
        printMenu(monkey1, monkey2);
    }
}
