package aula4_6.view;

import aula4_6.ProdutoManager;
import java.util.Scanner;

public class MenuUtils {
    public static int tentarObterProdutoIDExistente(Scanner scan, String message) {
        int idAlvo = lerInt(scan, message);

         if(!ProdutoManager.contemID(idAlvo)) {
            System.out.println("O id '" + idAlvo + "' não está cadastrado");
            return -1;
        }
        return idAlvo;
    }

    public static int lerInt(Scanner scan, String message) {
        System.out.print(message);
        int _int = scan.nextInt();
        scan.nextLine();
        return _int;
    }

    public static void aperteParaVoltar(Scanner scan) {
        System.out.print("Aperte qualquer tecla para voltar...");
        scan.nextLine();
    }

    public static String lerString(Scanner scan, String message) {
        System.out.print(message);
        return scan.nextLine();
    }

    public static double lerDouble(Scanner scan, String message) {
        System.out.print(message);
        double _double = scan.nextDouble();
        scan.nextLine();
        return _double;
    }
}
