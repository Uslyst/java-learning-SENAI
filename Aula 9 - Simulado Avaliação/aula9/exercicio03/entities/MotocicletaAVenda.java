package aula9.exercicio03.entities;

public class MotocicletaAVenda extends VeiculoAVenda {

    private static final String modelo = "Motocicleta";

    public MotocicletaAVenda(int ano, double precoDeVenda) {
        super(ano, modelo, precoDeVenda);
    }
}
