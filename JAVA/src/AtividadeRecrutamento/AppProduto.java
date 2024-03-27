package AtividadeRecrutamento;

import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos deseja listar");
        int qnt = sc.nextInt();

        for (int i = 0; i <= qnt; i++){
            AdicionarProduto adicionarProduto = new AdicionarProduto();
            adicionarProduto.AdicionarProd();
        }

        for (int g = 0; g <= qnt; g++){
            ListarProduto listarProduto = new ListarProduto();
            listarProduto.listProd();
        }


    }
}
