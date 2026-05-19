package aula11.exercicio01.entities;
import aula11.exercicio01.AtendimentoManager;

public class Senha {
    private int numero = 0;
    private boolean prioritaria = false;

    public Senha(boolean prioritaria) {
        this.prioritaria = prioritaria;
        numero = AtendimentoManager.gerarNumSenha();
    }

    public boolean isPrioritaria() {
        return prioritaria;
    }

    @Override
    public String toString() {
        return String.format("\nSenha: %d - Prioritária: %s", numero, prioritaria);
    }
}
