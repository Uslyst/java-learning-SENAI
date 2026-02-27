package Exercicio02.entities;

public class Square {
    private int side = 0;
    
    public int getSide() {
        return side;
    }
    
    public void setSide(int side) {
        this.side = side;
    }
    
    public int calcArea() {
        return side * side;
    }
}
