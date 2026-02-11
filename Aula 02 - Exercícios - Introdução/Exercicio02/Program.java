package Exercicio02;
import entities.Square;

public class Program {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);

        System.out.printf("Square side: %d\nSquare area: %d", square.getSide(), square.calcArea());     
    }   
}