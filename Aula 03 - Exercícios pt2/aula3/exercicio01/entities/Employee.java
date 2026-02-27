package aula3.exercicio01.entities;

public class Employee {
    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void increaseSalary(double percentIncrease) {
        double amount = salary * percentIncrease / 100;

        salary += amount;

        System.out.printf("\nSalary was increased by %.1f%%", percentIncrease);
    }

    public void showInfo() {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("\nName: %s", name);
        System.out.printf("\nSalary: %.2f", salary);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

}
