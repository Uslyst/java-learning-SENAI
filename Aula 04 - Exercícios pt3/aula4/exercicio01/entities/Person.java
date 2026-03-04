package aula4.exercicio01.entities;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void growOld() {
        if(age < 21) {
            growHeight(0.5f);
        }

        age++;
    }

    public void gainWeight(double weight){
        this.weight += weight;
    }

    public void growHeight(double height) {
        this.height += height;     
    }

    public void loseWeight(double weight){
        this.weight -= weight;
    }

    public void printPerson() {
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("\nName: %s", name);
        System.out.printf("\nAge: %d", age);
        System.out.printf("\nWeight: %.2f", weight);
        System.out.printf("\nHeight: %.2f", height);
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
