package aula3.exercicio03;
import aula3.exercicio03.entities.MonkeyWithVectorStomach;
import aula3.utils.MonkeyBase;
import aula3.utils.MonkeyMenu;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a name to the first monkey: ");
        MonkeyBase monkee1 = new MonkeyWithVectorStomach(scanner.nextLine());
        System.out.print("Give a name to the second monkey: ");
        MonkeyBase monkee2 = new MonkeyWithVectorStomach(scanner.nextLine());

        MonkeyMenu.menu(scanner, monkee1, monkee2);
    } 
}