package aula3.exercicio01;
import aula3.exercicio01.entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide the salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Provide the name: ");
        String name = scanner.nextLine();

        Employee empl = new Employee(salary, name);

        empl.showInfo();
        
        System.out.print("\nProvide the salary increase pecentage number: ");
        double increasePercentage = scanner.nextDouble();
        scanner.nextLine();

        empl.increaseSalary(increasePercentage);

        empl.showInfo();

        scanner.close();
    }
}