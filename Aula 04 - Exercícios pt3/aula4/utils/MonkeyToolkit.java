package aula3.utils;
public class MonkeyToolkit {
    public static void printStatus(MonkeyBase monkey) {
        String name = monkey.getName();

        System.out.printf("\n%s", name);

        if(!monkey.getIsAlive()) {
            System.out.printf("\n\"%s is dead.\"", name);
            return;
        }

        System.out.printf("\nHunger: %d%%", monkey.getHungerBar());
        System.out.printf("\nStomach: %s", monkey.showStomach());
        System.out.printf("\n\"%s %s\"", name, monkey.getStateSentence());
    }
    
    public static String getHungerBasedState(int hungerBar) {
        if(hungerBar <= 10) 
            return "has a full belly";
        if (hungerBar <= 30) 
            return "is satisfied";
        if (hungerBar <= 40) 
            return "enjoyed the snack";
        if(hungerBar <= 50) 
            return "is calm";
        if(hungerBar <= 70) 
            return "is thinking about bananas";
        if(hungerBar <= 90) 
            return "is hungry";
        if(hungerBar <= 100) 
            return "is starving!!!";
        return "state not found";
    }

    public static void tryCannibalism(MonkeyBase monkee1, MonkeyBase monkee2) {
        if(monkee1.getIsAlive() && monkee2.getIsAlive()) {
            if(monkee1.willCommitCannibalism()) {
                monkee1.ingest(monkee2.getName(), 100);
                monkee2.kill();
            } else if(monkee2.willCommitCannibalism()) {
                monkee2.ingest(monkee1.getName(), 100);
                monkee1.kill();
            }
        }
    }
}
