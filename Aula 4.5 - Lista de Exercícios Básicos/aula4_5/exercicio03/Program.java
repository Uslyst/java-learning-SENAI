package aula4_5.exercicio03;
import aula4_5.exercicio03.entities.Produto;

public class Program {
    public static void main(String[] args){
        Produto produto = new Produto("Bolo", 5.50, 5);
        System.out.println(produto.toString());

        Produto produto2 = new Produto("Arroz", 11.39, 2);
        System.out.println(produto2.toString());
    } 
}