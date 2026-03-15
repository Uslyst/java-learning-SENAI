package aula4_6;

import aula4_6.entities.Produto;
import aula4_6.exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoManager {
    private static final List<Produto> produtos = new ArrayList<>();

    public static void criarProduto(String nome, int id, double preco, int quantidade) {
        if(contemID(id)) {
            throw new DuplicatedProductIDException("Impossivel criar um produto: O id '" + id + "' já existe");
        }

        produtos.add(new Produto(nome, id, preco, quantidade));
    }

    public static Produto obterProdutoPorID(int id) {
        return produtos.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public static void editarProduto(int idAlvo, String novoNome, double novoPreco, int novaQuantidade) {
        var produto = obterProdutoPorID(idAlvo);
        produto.setNome(novoNome);
        produto.setPreco(novoPreco);
        produto.setQuantidade(novaQuantidade);
    }

    public static boolean contemID(int id) {
        return produtos.stream()
                       .anyMatch(p -> p.getId() == id);
    }

    public static void removerProduto(int id) {
        produtos.remove(obterProdutoPorID(id));     
    }

    public static String obterToStringProdutos() {
        StringBuilder sb = new StringBuilder();

        for (Produto p : produtos) {
            sb.append(p.toString()).append("\n");
        }

        return sb.toString();
    }

    public static boolean possuiNome(String nome) {
        return produtos.stream()
                        .anyMatch(p -> p.getNome().equals(nome));
    }

    public static Produto obterProdutoPorNome(String nome) {
        return produtos.stream()
                        .filter(p -> p.getNome()
                        .equals(nome)).findFirst()
                        .orElse(null);
    }
    
}
    
