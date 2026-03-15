package aula4_5.exercicio04;
import aula4_5.exercicio04.entities.ContaBancaria;

public class Program {
    public static void main(String[] args){
        ContaBancaria cb = new ContaBancaria("Joao", 100, 1);
        System.out.println(cb.toString());
        cb.depositar(200);

        if (cb.sacar(230) == -1) {
            System.err.println("Saldo insuficiente");
        }

        System.out.println(cb.toString());
    } 
}