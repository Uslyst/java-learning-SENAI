package aula3.exercicio03.entities;
import aula3.utils.MonkeyBase;
import aula3.utils.MonkeyToolkit;

public class MonkeyWithVectorStomach extends MonkeyBase {
    private final int stomachSize = 6;
    private final String[] stomach = new String[stomachSize];
    private int nextStomachIndex = 0;

    public MonkeyWithVectorStomach(String name) {
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
    public void ingest(String food, int satiety) {    
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
                if(stomach[i].compareTo("") == 0)
                    continue;
                
                message.append(stomach[i]);

                int nextIndex = i + 1;

                if (stomach[nextIndex] == null)
                    break;

                if(stomach[nextIndex].compareTo("") != 0) {
                    message.append(", ");
                }
            }       
        }
        
        return message.toString();
    }

    @Override
    public void digest() {
        for (int i = 0; i < stomach.length; i++) {
            stomach[i] = "";
        }

        nextStomachIndex = 0;
        stateSentence = "has pooped";       
    }
}
