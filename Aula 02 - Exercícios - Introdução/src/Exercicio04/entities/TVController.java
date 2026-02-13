package Exercicio04.entities;

public class TVController {
    private int channel = 0;
    private int volume = 50;
    
    public int getChannel() {
        return channel;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setChannel(int channel) {      
        this.channel = normalizeTo100(channel);
    }
    
    public void setVolume(int volume) {
        this.volume = normalizeTo100(volume);
    }
    
    public void increaseVolume(int amount) {
        setVolume(normalizeTo100(Math.abs(volume + amount)));
    }

    public void decreaseVolume(int amount) {
        setVolume(normalizeTo100(Math.abs(volume - amount)));
    }

    private int normalizeTo100(int amount) {
        if(amount > 100 )
            return 100;
        if(amount < 0) 
            return 0;
        return amount;
    }

    public void print() {
        System.out.printf("\nCurrent channel: %d\nCurrent volume: %d", channel, volume);
    }
}
