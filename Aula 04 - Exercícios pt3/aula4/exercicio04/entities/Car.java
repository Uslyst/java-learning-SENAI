package aula4.exercicio04.entities;

public class Car {
    private double fuel = 0; // L
    private double consumption; // km/L

    public Car() {

    }
    
    public void addFuel(double amount) {
        fuel += amount;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double amount) {
        consumption = amount;
    }

    public void drive(double distanceKm) {
        if(fuel == 0) {
            System.out.print("Out of fuel..");
            return;
        }

        double fuelConsumption = (distanceKm / consumption);
        double finalFuel = fuel - fuelConsumption;

        if(finalFuel < 0) {
            System.out.printf("Unable to drive %.2f KM: Not enough fuel.", distanceKm);
            return;
        }
        fuel = finalFuel;
    }

    public void refuel(double amount) {
        fuel += amount;
    }

    public void printCar() {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("\nCar Stats");
        System.out.printf("\nFuel: %.2f", fuel);
        System.out.printf("\nConsumption: %.2f KM/L", consumption);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
