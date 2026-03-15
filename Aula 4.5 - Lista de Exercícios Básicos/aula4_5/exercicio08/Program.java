package aula4_5.exercicio08;
import aula4_5.exercicio08.entities.Retangulo;

public class Program {
    public static void main(String[] args){
        Retangulo rect = new Retangulo(6, 6);
        System.out.println(rect.toString());

        Retangulo rect2 = new Retangulo(2, 4);
        System.out.println(rect2.toString());
    } 
}