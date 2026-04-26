package aula9.exercicio05;
import aula9.exercicio05.entities.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ItemOrcamento item1 = new ItemOrcamento("teclado gamer", 100);
        ItemOrcamento item2 = new ItemOrcamento("Mouse gamer", 50);
        ItemOrcamento item3 = new ItemOrcamento("Monitor gamer", 800);

        ItemOrcamentoComplexo kit = new ItemOrcamentoComplexo("Setup gamer", Arrays.asList(item1, item2, item3));

        System.out.println("Valor total: " + kit.getValor());

        ItemOrcamento encontrado = kit.encontrarItem("Mouse gamer");
        System.out.println("Encontrado: " +(encontrado != null ? encontrado.getHistorico() : "não existe"));
    }
}