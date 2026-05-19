package aula11.exercicio01;

import aula11.exercicio01.entities.Senha;

public class Atendente {
    public static void main(String[] args) {

        for(int i = 0; i < 12; i++) {
            AtendimentoManager.adicionarSenha(new Senha(false));
        }

        for(int i = 0; i < 7; i++) {
            AtendimentoManager.adicionarSenha(new Senha(true));
        }

        AtendimentoManager.atender();
    }
}
