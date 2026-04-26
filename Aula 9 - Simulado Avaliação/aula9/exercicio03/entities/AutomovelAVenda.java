package aula9.exercicio03.entities;

public class AutomovelAVenda extends VeiculoAVenda {
    private static final String modelo = "Veiculo";

    public AutomovelAVenda(int ano, double precoDeVenda) {
        super(ano, modelo, precoDeVenda);
    }
}
