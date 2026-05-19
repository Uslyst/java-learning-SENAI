package aula11.exercicio04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String phrase = sc.nextLine();

        String[] tokens = phrase.split(" ");

        int repeated = 0;
        Set<String> tokensSemRepeticao = new HashSet<>();

        for (String p : tokens) {
            if (!tokensSemRepeticao.add(p)) {
                repeated += 2;
            }
        }

        System.out.printf("Numero de palavras não repetidas: %d", tokens.length - repeated);
    }
}