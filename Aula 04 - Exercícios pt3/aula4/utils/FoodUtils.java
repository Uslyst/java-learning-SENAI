package aula3.utils;

public class FoodUtils {
    private static int sacietyMax = 100;
    private static int kcalMax = 500;

    public static double clampKcal(double kcal) {
        return (double)Math.max(0, Math.min(kcal, kcalMax));
    }
    
    public static int calcSatiety(double kcal) {
        //100 - max satiety
        //500 kcal - max kcal

        //500 kcal -> 100
        //250 kcal -> x

        double product = kcal * sacietyMax;
        return (int)(product / kcalMax);
    }

    public static double calcKcal(int satiety) {
        double product = satiety * kcalMax;
        return product / sacietyMax;
    }
}
