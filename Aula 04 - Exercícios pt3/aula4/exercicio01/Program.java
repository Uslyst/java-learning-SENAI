package aula4.exercicio01;
import aula4.exercicio01.entities.Person;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide the name: ");
        String name = scanner.nextLine();

        System.out.print("Provide the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Provide the weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Provide the height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        Person person = new Person(name, age, weight, height);
        
        boolean quit = false;
        
        while(!quit) {
            person.printPerson();

            System.out.print("\n1. Grow Old \n2. Gain Weight \n3. Lose Weight \n4. Grow Hight \n5. Quit \n:");
            
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    person.growOld();
                    break;
                case 2:
                    System.out.print("Gain weight amount: ");
                    double wAmount = scanner.nextDouble();
                    scanner.nextLine();
                    person.gainWeight(wAmount);
                    break;
                case 3:
                    System.out.print("Lose weight amount: ");
                    double wAmount2 = scanner.nextDouble();
                    scanner.nextLine();
                    person.loseWeight(wAmount2);
                    break;
                case 4:                 
                    System.out.print("Height amount: ");
                    double hAmount = scanner.nextDouble();
                    scanner.nextLine();
                    person.growHeight(hAmount);
                    break;
                default:
                    quit = true;
                    break;
            }
        }
        scanner.close();
        
    }
}