package aula4_6.entities;

public class Produto {
    private String nome;
    private int id;
    private double preco;
    private int quantidade;

    public Produto(String nome, int id, double preco, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format(
            "\nProduto: %s\nID: %d\nPreço: %.2f\nQuantidade: %d\nValor total no estoque: %.2f",
            nome, id, preco, quantidade, (preco * quantidade)
        );
    }
}