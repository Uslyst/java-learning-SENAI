package aula4_6.view;
import aula4_6.ProdutoManager;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
    private static void mostrarMenu() {
        System.out.print("\n===== SISTEMA DE PRODUTOS =====\n1. Cadastrar Produto\n2. Listar Produtos\n3. Atualizar Produto\n4. Remover Produto\n5. Sair\n:");
    }

    public static void iniciarMenu() {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);

        while (!sair) {
            try {
                mostrarMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("\n--- Cadastrando Produto ---");
                        cadastrarProduto(scanner);
                    } case 2 -> {
                        System.out.println("\n--- Listando Produtos ---");
                        String produtosString = ProdutoManager.obterToStringProdutos();

                        if(produtosString.isEmpty()) {
                            System.out.println("Nenhum produto encontrado.");
                           
                        } else {
                            System.out.println(produtosString);
                        }   

                        
                    } case 3 -> {
                        System.out.println("\n--- Atualizando Produto ---");
                        atualizarProduto(scanner);
                    } case 4 -> {
                        System.out.println("\n--- Removendo Produto ---");
                        removerProduto(scanner);
                    } default -> {
                        sair = true;                     
                    }
                }

                if(!sair) 
                    MenuUtils.aperteParaVoltar(scanner);
            } catch (InputMismatchException e) {
                System.err.println("\nFormato invalido!");     
                scanner.nextLine();      
            } 
            catch (Exception e) {
                System.err.printf("\nErro no menu: %s", e.getMessage());           
            }          
        }
        scanner.close();
    }



    private static void cadastrarProduto(Scanner scan) {
        int id = MenuUtils.lerInt(scan, "Digite o id do produto: ");
        if(ProdutoManager.contemID(id)) {
            System.out.println("\\O ID já foi cadastrado.");
            return;
        }

        String nome = MenuUtils.lerString(scan, "Digite o nome do produto: ");
        double preco = MenuUtils.lerDouble(scan, "Digite o preço do produto: ");
        int qnt = MenuUtils.lerInt(scan, "Digite a quantidade do produto: ");

        ProdutoManager.criarProduto(nome, id, preco, qnt);

        System.out.println("\nProduto Criado com sucesso!");
    }

    private static void atualizarProduto(Scanner scan) {
        int idAlvo = MenuUtils.tentarObterProdutoIDExistente(scan, "Digite o id do produto que voce deseja editar: ");

        if(idAlvo == -1) {
            return;
        }

        String nome = MenuUtils.lerString(scan, "Digite o novo nome do produto: ");
        double preco = MenuUtils.lerDouble(scan, "Digite o novo preço do produto: ");
        int qnt = MenuUtils.lerInt(scan, "Digite a nova quantidade do produto: ");

        ProdutoManager.editarProduto(idAlvo, nome, preco, qnt);

        System.out.println("\nProduto Atualizado com sucesso!");
    }
    
    private static void removerProduto(Scanner scan) {
        int idAlvo = MenuUtils.tentarObterProdutoIDExistente(scan, "Digite o id do produto que voce deseja remover: ");
        
        if(idAlvo == -1) {
            return;
        }

        ProdutoManager.removerProduto(idAlvo);

        System.out.println("\nProduto Removido com sucesso!");
    }
}
