package AtividadeRecrutamento;

import java.util.Scanner;

public class AdicionarProduto extends Produto{



    private Scanner sc;

    public AdicionarProduto(){
        sc = new Scanner(System.in);
    }

    public void AdicionarProd() {
        System.out.println("Nome do produto:");
        String name = sc.nextLine();

        System.out.println("Descrição:");
        String description = sc.nextLine();

        System.out.println("Preço do produto:");
        double price = 0;
        boolean isValidPrice = false;

        while (!isValidPrice) {
            try {
                price = sc.nextDouble();
                isValidPrice = true;
            } catch (Exception e) {
                System.out.println("Por favor, digite um preço válido.");
                sc.nextLine(); // Limpa o buffer do scanner para evitar loops infinitos
            }
        }
        System.out.println("Digite 1 se estiver disponível para venda, ou 2 para não disponível:");
        int op = sc.nextInt();
        boolean isAvailable = false;

        if (op == 1) {
            isAvailable = true;
        } else if (op == 2) {
            isAvailable = false;
        } else {
            System.out.println("Opção inválida, considerando não disponível.");
        }


        // Aqui você pode usar os dados coletados para adicionar o produto à sua lista ou fazer outras operações
        // Exemplo de uso dos dados coletados:
        System.out.println("Produto adicionado com sucesso:");
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Preço: " + price);
        System.out.println("Disponível para venda: " + (isAvailable ? "Sim" : "Não"));
    }
}
