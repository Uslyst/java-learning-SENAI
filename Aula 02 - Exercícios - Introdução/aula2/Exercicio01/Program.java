package Exercicio01;
import Exercicio01.entities.Ball;

public class Program {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setColor("Azul");
        
        System.out.println(ball.getColor());        
    }   
}