package Exercicio03.entities;

public class Rect {
    private int base;
    private int height;
    
    public int getBase() {
        return base;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int calcArea() {
        return base * height;
    } 
    
    public int calcPerimeter() {
        return (base * 2) + (height * 2);
    }
}
