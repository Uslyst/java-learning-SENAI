package aula4_5.exercicio06;
import aula4_5.exercicio06.entities.Carro;

public class Program {
    public static void main(String[] args){
        Carro carro = new Carro("Fiat", 50, "Modelo 1");
        System.out.println(carro.toString());
        carro.acelerar(30);
        System.out.println(carro.toString());
        carro.frear();
        System.out.println(carro.toString());
    } 
}