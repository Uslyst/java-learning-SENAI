package aula3.exercicio02.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monkey {
    private String name;
    private Boolean isAlive = true;
    private List<String> stomach = new ArrayList<>();
    private int hungerBar = 50; 
    private String state;

    public Monkey(String name) {
        this.name = name;
        state = "is calm";
    }

    public String getName() {
        return name;    
    }
    
    public boolean getIsAlive() {
        return isAlive;
    }
    public void showStatus() {
        System.out.printf("\n%s", getName());

        if(!isAlive) {
            System.out.printf("\n\"%s is dead.\"", getName());
            return;
        }

        System.out.printf("\nHunger: %d%%", getHungerBar());
        System.out.printf("\nStomach: %s", showStomach());
        System.out.printf("\n\"%s %s\"", name, state);
    }

    public int getHungerBar() {
        return hungerBar;
    }

    public boolean willCommitCanibalism() {
        if(hungerBar == 100) {
            Random random = new Random();

            if(random.nextBoolean()) {
                return true;
            } else {
                state = "had malicious thoughts...";
            }
        }
        return false;
    }

    public boolean tryRandomDigestion() {
        Random random = new Random();

        if(random.nextInt(4) == 0) {
            digest();
            return true;
        }
        return false;
    }

    public void increaseHunger() {
        hungerBar += 10;

        if(hungerBar > 100)
            hungerBar = 100;

        updateHungerBasedState();
    }

    private void updateHungerBasedState() {
        if(hungerBar <= 10) {
            state = "has a full belly";
        } else if (hungerBar <= 30) {
            state = "is satisfied";
        } else if (hungerBar <= 40) {
            state = "enjoyed the snack";
        } else if(hungerBar <= 50) {
            state = "is calm";
        } else if(hungerBar <= 70) {
            state = "is thinking about bananas";
        } else if(hungerBar <= 90) {
            state = "is hungry";
        } else if(hungerBar <= 100) {
            state = "is starving!!!";
        } 
    }

    public void feed(String food, int satiety) {    
        hungerBar -= satiety;

        if(hungerBar < 0){
            hungerBar = 0;
        }
        
        updateHungerBasedState();

        if(tryRandomDigestion())
            return;

        stomach.add(food);
    }

    public String showStomach() {      
        StringBuilder message = new StringBuilder();

        int size = stomach.size();

        if(size == 0) {
            message.append("empty");
        }else {
            for(int i = 0; i < size; i++) {
                message.append(stomach.get(i));
                if(i != size - 1) {
                    message.append(", ");
                }
            }       
        }
        
        return message.toString();
    }


    public void digest() {
        stomach.clear();
        state = "pooped";
    }
    
    public void kill() {
        isAlive = false;
    }
}
