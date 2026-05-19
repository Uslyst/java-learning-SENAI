package aula11.exercicio05;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> bagOfWords = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String phrase = sc.nextLine();

        String[] tokens = phrase.split(" ");

        for (String t : tokens) {
            bagOfWords.put(t, bagOfWords.getOrDefault(t, 0) + 1);
        }

        System.out.print(bagOfWords.toString());
    }
}
