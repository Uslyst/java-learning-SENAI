package aula4_5.exercicio02;
import aula4_5.exercicio02.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 17, 1.76);
        System.out.println(pessoa.toString());

        Pessoa pessoa2 = new Pessoa("Carlos", 19, 1.80);
        System.out.println(pessoa2.toString());
    }
}
