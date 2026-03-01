package aula3.exercicio04.entities;
import aula3.utils.FoodUtils;

public class Food {
    private String name;
    private double kcal;
    private int satiety = -1;
    
    public String getName() { return name; }

    public double getKcal() { return kcal; }

    public void setName(String name) { this.name = name; }

    public void setKcal(double kcal) { 
        this.kcal = FoodUtils.clampKcal(kcal);
        satiety = -1; 
    }

    public int getSatiety() {
        if(satiety == -1) {
            satiety = FoodUtils.calcSatiety(this.kcal);
        }
        return satiety;
    }

    public Food(String name, double kcal) {
        this.kcal = FoodUtils.clampKcal(kcal);
        this.name = name;
    }  
}
