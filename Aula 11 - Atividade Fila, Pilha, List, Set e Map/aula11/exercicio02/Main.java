package aula11.exercicio02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
     public static void main(String[] args) {
        System.out.print("\nDigite a palavra: ");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine().toLowerCase();

        //com stack
        Stack<Character> caracteres = new Stack<>();
        for(char c : palavra.toCharArray()) {
            caracteres.push(c);
        }

        StringBuilder sb = new StringBuilder();
        int size = caracteres.size();
        for (int i = 0; i < size; i++) {    
             sb.append(caracteres.pop());
        }

        System.out.print("\nResultado com stack: ");
        printResultado(sb.toString().equals(palavra));
        scan.close();
        
        //sem stack
        System.out.print("\nResultado sem stack: ");
        boolean isPalindromo = palavra.equals(new StringBuilder(palavra).reverse().toString());
        printResultado(isPalindromo);

        System.out.printf("\n\n%s, %s", sb.toString(), palavra);
    }

    private static void printResultado(boolean isPalindromo) {
        System.out.printf("\n%s", isPalindromo ? "É um palíndromo" : "Não é um palíndromo");
    }
}
