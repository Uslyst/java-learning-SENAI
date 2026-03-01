package aula3.exercicio02.entities;
import aula3.utils.MonkeyBase;
import aula3.utils.MonkeyToolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonkeyWithListStomach extends MonkeyBase {
    private final List<String> stomach = new ArrayList<>();

    public MonkeyWithListStomach(String name) {
        super(name);
    }

    @Override
    public boolean willDigest() {
        Random random = new Random();

        if(random.nextInt(4) == 0) {
            digest();
            return true;
        }
        return false;
    }

    public void ingest(String food, int satiety) {    
        hungerBar -= satiety;

        if(hungerBar < 0){
            hungerBar = 0;
        }
        
        stateSentence = MonkeyToolkit.getHungerBasedState(hungerBar);

        if(willDigest())
            return;

        stomach.add(food);
    }

    @Override
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

    @Override
    public void digest() {
        stomach.clear();
        stateSentence = "has pooped";
    }
}
