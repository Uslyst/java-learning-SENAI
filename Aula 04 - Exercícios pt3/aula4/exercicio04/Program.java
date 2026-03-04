package aula4.exercicio04;
import aula4.exercicio04.entities.Car;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide the car consumption km/L: ");
        double consumption = scanner.nextDouble();
        scanner.nextLine();

        Car car = new Car();
        car.setConsumption(consumption);

        boolean quit = false;

        while(!quit) {
            car.printCar();

            System.out.print("\n1. Refuel \n2. Drive \n3. Quit \n:");
            
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.print("Refuel amount: ");
                    double rAmount = scanner.nextDouble();
                    car.addFuel(rAmount);
                    break;
                case 2:
                    if(car.getFuel() == 0) {
                        System.out.print("Out of fuel");
                        continue;
                    }
                    System.out.print("KM to drive: ");
                    double km = scanner.nextDouble();
                    car.drive(km);
                    break;
                default:
                    quit = true;
                    break;
            }
        }
        scanner.close();
    } 
}