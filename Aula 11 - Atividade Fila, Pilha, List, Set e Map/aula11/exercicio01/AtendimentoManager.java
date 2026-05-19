package aula11.exercicio01;
import aula11.exercicio01.entities.Senha;
import java.util.LinkedList;
import java.util.Queue;

public class AtendimentoManager {
    private static int senhaAtual = 0;
    private static final Queue<Senha> normais = new LinkedList<>();
    private static final Queue<Senha> prioritarios = new LinkedList<>();
    private static final int intervaloPrioridade = 3;

    public static int gerarNumSenha() {
        return senhaAtual++;
    }

   public static Senha criarSenha(boolean prioritario) {
        return new Senha(prioritario);
   }
   
   public static void adicionarSenha(Senha senha) {
        if(senha.isPrioritaria()) 
            prioritarios.add(senha);
        else 
            normais.add(senha);
   }

   private static void atenderPrioritario() {
        for (int i = 0; i < intervaloPrioridade && !prioritarios.isEmpty(); i++) {
            System.out.print(prioritarios.poll().toString());
        }
   }

   private static void atenderNormal() {
        if(!normais.isEmpty()) 
            System.out.print(normais.poll().toString()); 
   }

   public static void atender() {
        while(!normais.isEmpty() || !prioritarios.isEmpty()) {                
            atenderPrioritario();
            atenderNormal();        
        }  
   }
}
