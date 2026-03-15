package aula4_5.exercicio07;
import aula4_5.exercicio07.entities.Livro;

public class Program {
    public static void main(String[] args){
        Livro livro = new Livro("Livro y", "Autor x", 130, true);
        System.out.println(livro.toString());
        livro.emprestar();
        System.out.println(livro.toString());
        livro.devolver();
        System.out.println(livro.toString());
    } 
}