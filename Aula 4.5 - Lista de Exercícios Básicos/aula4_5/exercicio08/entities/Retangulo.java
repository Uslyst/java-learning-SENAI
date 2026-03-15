package aula4_5.exercicio08.entities;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("\nLargura: %.2f \nAltura: %.2f \nArea: %.2f \nPerimetro %.2f \nE quadrado: %s", largura, altura, calcArea(), CalcPerimetro(), isQuadrado());
    }

    public double calcArea() {
        return largura * altura;
    }

    public double CalcPerimetro() {
        return (altura * 2) + (largura * 2);
    }

    public boolean isQuadrado() {
        return largura == altura;
    }
}
