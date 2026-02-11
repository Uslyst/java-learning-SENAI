package entities;

public class Square {
    private float side = 0;
    
    public float getSide() {
        return side;
    }
    
    public void setSide(float side) {
        this.side = side;
    }
    
    public float calcArea() {
        return side * side;
    }
}
