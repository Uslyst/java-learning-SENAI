package aula4_5.exercicio05.entities;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private int matricula;

    public Aluno(String nome, double nota1, double nota2, int matricula) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("\nNome '%s' \nMatricula: %d \nNota 1: %.2f \nNota 2: %.2f \n%s", nome, matricula, nota1, nota2, (calcMedia() > 7  ? "Aprovado" : "Reprovado"));
    }

    public double calcMedia() {
        return (nota1 + nota2) / 2;
    }
}
