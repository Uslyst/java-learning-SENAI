package aula4_5.exercicio06.entities;

public class Carro {
    private String marca;
    private double velocidade;
    private String modelo;

    public Carro(String marca, double velocidade, String modelo) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.modelo = modelo;
    }

    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return String.format("\nMarca '%s' \nModelo: %s \nVelocidade: %.2f", marca, modelo, velocidade);
    }

    public void acelerar(double qnt) {
        if(qnt < 0) {
            return;
        }

        velocidade += qnt;
    }

    public void frear() {
        velocidade = 0;
    }
}
