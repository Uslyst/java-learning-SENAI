package entities;

public class Rect {
    private float base;
    private float height;
    
    public float getBase() {
        return base;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setBase(float base) {
        this.base = base;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public float calcArea() {
        return base * height;
    } 
    
    public float calcPerimeter() {
        return (base * 2) + (height * 2);
    }
}
