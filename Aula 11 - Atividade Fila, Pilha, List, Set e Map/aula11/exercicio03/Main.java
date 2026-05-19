package aula11.exercicio03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       
        while (true) {
            System.out.print("\nDigite um expressão matemática com parentesis: ");

            Scanner scan = new Scanner(System.in);
            String expressao = scan.nextLine();

            /*acho que é desnecessario pois o isParentesisEmOrdem já faz isso
            //estamos fazendo duas iterações desnecessárias
            long qtdA = expressao.chars().filter(c -> c == '(').count();
            long qtdB = expressao.chars().filter(c -> c == ')').count();

            if(qtdA != qtdB) {
                System.out.print("\nNão existem parentesis suficientes");
                continue;  
            }
            */
            System.out.printf("\n%s", isParentesisEmOrdem(expressao) ? "Expressão certa!" : "Expressão errada..");
        }
    }

    private static boolean isParentesisEmOrdem(String expressao) {
        Stack<Character> parentesis = new Stack<>();
        
        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                parentesis.push(c);
            } else if (c == ')') {
                if (parentesis.isEmpty()) 
                    return false;          
                parentesis.pop(); 
            }
        }
        //exemplos
        //CERTO: (A+B) -> push (, pop com ) -> pilha fica vazia 
        //ERRADO: ((A+B) -> push (, push (, pop com ) -> sobra 1 (

        return parentesis.isEmpty(); 
    }
}
