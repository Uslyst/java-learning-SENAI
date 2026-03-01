package aula3.utils;
import java.util.Random;

public abstract class MonkeyBase {
    protected String name;
    protected String stateSentence = "is calm";
    protected Boolean isAlive = true;
    protected int hungerBar = 50; 

    public String getName() { return name; }
    public boolean getIsAlive() { return isAlive; }
    public int getHungerBar() { return hungerBar; }
    public String getStateSentence() { return stateSentence; }

    public abstract boolean willDigest();
    public abstract String showStomach();
    public abstract void digest();
    public abstract void ingest(String food, int satiety);

    public MonkeyBase(String name) {
        this.name = name;
    }

    public void kill() {
        isAlive = false;
    }

    public void increaseHunger() {
        hungerBar += 20;

        if(hungerBar > 100)
            hungerBar = 100;

        stateSentence = MonkeyToolkit.getHungerBasedState(hungerBar);
    }

    public boolean willCommitCannibalism() {
        if(hungerBar == 100) {
            Random random = new Random();

            if(random.nextBoolean()) {
                return true;
            } else {
                stateSentence = "had malicious thoughts...";
            }
        }
        return false;
    }
}
