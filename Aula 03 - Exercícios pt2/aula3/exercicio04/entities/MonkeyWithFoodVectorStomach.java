package aula3.exercicio04.entities;
import aula3.utils.FoodUtils;
import aula3.utils.MonkeyBase;
import aula3.utils.MonkeyToolkit;

public class MonkeyWithFoodVectorStomach extends MonkeyBase {
    private final int stomachSize = 6;
    private final Food[] stomach = new Food[stomachSize];
    private int nextStomachIndex = 0;

    public MonkeyWithFoodVectorStomach(String name) {
       super(name);
    }

    @Override
    public boolean willDigest() {
        if(nextStomachIndex == stomachSize - 1) {
            digest();
            return true;
        }
        return false;
    }
    
    @Override
    public void ingest(String name, int satiety) {
        double kcal = FoodUtils.calcKcal(satiety);
        
        Food food = new Food(name, kcal);
        ingest(food);
    }

    public void ingest(Food food) {   
        double satiety = food.getSatiety();
        hungerBar -= satiety;

        if(hungerBar < 0){
            hungerBar = 0;
        }
        
        super.stateSentence = MonkeyToolkit.getHungerBasedState(hungerBar);

        if(willDigest())
            return;

        stomach[nextStomachIndex] = food;
        nextStomachIndex++;
    }

    @Override
    public String showStomach() {      
        StringBuilder message = new StringBuilder();

        if(nextStomachIndex == 0) {
            message.append("empty");
        }else {
            for(int i = 0; i < nextStomachIndex; i++) {
                Food food = stomach[i];
                if(food == null)
                    continue;
                
                message.append(food.getName());           
                message.append(" [").append(food.getKcal()).append(" Kcal]");

                int nextIndex = i + 1;

                if (stomach[nextIndex] == null)
                    break;

                message.append(", ");           
            }       
        }
        
        return message.toString();
    }

    @Override
    public void digest() {
        for (int i = 0; i < stomach.length; i++) {
            stomach[i] = null;
        }

        nextStomachIndex = 0;
        stateSentence = "has pooped";       
    }
}
