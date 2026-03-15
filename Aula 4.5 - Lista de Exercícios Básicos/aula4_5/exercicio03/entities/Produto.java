package aula4_5.exercicio03.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("\nProduto '%s' \nPreco: %.2f, \nQuantidade em Estoque: %d, \nValor Total: %.2f", nome, preco, quantidade, GetValorTotal());
    }

    public double GetValorTotal() {
        return preco * quantidade;
    }
}
