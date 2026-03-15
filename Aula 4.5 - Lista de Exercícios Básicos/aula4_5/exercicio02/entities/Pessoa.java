package  aula4_5.exercicio02.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;   
    }   

    @Override
    public String toString() {
        return String.format("\nPessoa '%s' \nIdade: %d \nAltura: %.2f \n%s", nome, idade, altura, (IsMaiorDeIdade() ? "Maior de idade" : "Menor de idade"));
    }

    public boolean IsMaiorDeIdade() {
        return idade >= 18;
    } 
}
