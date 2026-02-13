package Exercicio03;
import Exercicio03.entities.Rect;

public class Program {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setBase(4);
        rect.setHeight(7);
        
        System.out.printf("Rect base: %d\nRect height: %d\n", rect.getBase(), rect.getHeight());         
        System.out.printf("Rect area: %d\nRect perimeter: %d", rect.calcArea(), rect.calcPerimeter());       
    }   
}
