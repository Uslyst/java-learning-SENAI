package aula3.exercicio04;
import aula3.exercicio04.entities.MonkeyWithFoodVectorStomach;
import aula3.utils.MonkeyMenu;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a name to the first monkey: ");
        MonkeyWithFoodVectorStomach monkee1 = new MonkeyWithFoodVectorStomach(scanner.nextLine());
        System.out.print("Give a name to the second monkey: ");
        MonkeyWithFoodVectorStomach monkee2 = new MonkeyWithFoodVectorStomach(scanner.nextLine());

        MonkeyMenu.menu(scanner, monkee1, monkee2);
    } 
}