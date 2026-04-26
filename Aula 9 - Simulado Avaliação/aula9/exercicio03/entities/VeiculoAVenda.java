package aula9.exercicio03.entities;

public class VeiculoAVenda {
    private int ano;
    private String modelo;
    private double precoDeVenda;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public VeiculoAVenda(int ano, String modelo, double precoDeVenda) {
        this.ano = ano;
        this.modelo = modelo;
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public String toString() {
        return String.format("\nModelo: %s,\nAno: %d,\nPreço: %.2f", modelo, ano, precoDeVenda);
    }
}

