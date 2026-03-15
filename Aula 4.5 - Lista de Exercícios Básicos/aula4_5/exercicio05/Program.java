package aula4_5.exercicio05;
import aula4_5.exercicio05.entities.Aluno;

public class Program {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Igor", 6, 7, 234);
        System.out.println(aluno.toString());

        Aluno aluno2 = new Aluno("Julia", 8, 9, 346);
        System.out.println(aluno2.toString());
    } 
}