package aula4_5.exercicio09.entities;

public class Celular {
    private String marca;
    private String modelo;
    private String atual;
    private int bateria;

    public Celular(String marca, String modelo, String atual, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.atual = atual;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return String.format("\nMarca: '%s' \nModelo: %s \nView Atual: %s \nBateria %d%%", marca, modelo, atual, bateria);
    }

    public void mudarViewAtual(String view) {
        atual = view;
    }

    public void descarregar(int qnt) {
        if(qnt < 0) 
            return;

        bateria -= qnt;
    }

    public void carregar(int qnt) {
        if(qnt < 0) 
            return;

        bateria += qnt;
    }
}
