package aula9.exercicio03;
import aula9.exercicio03.entities.*;

public class Program {
    public static void main(String[] args) {
        VeiculoAVenda carro = new AutomovelAVenda(2020, 85000.0);
        VeiculoAVenda moto = new MotocicletaAVenda(2022, 15000.0);

        System.out.println(carro);
        System.out.println(moto);
    }
}
