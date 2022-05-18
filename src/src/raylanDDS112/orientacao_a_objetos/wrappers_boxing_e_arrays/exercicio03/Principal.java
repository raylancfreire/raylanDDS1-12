package src.raylanDDS112.orientacao_a_objetos.wrappers_boxing_e_arrays.exercicio03;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos deseja cadastrar?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();
        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProdutos];
        for (int i = 0; i < estoque.produtos.length; i++){
            estoque.produtos[i] = new Produto();
            System.out.println("\nProduto " + i);
            System.out.println("--------------");
            System.out.println("Informe a descrição do produto:");
            estoque.produtos[i].descricao = scanner.nextLine();
            System.out.println("Informe a quantidade de itens:");
            estoque.produtos[i].quantidade = scanner.nextInt();
            scanner.nextLine();
        }
        estoque.listarProdutos();
    }
}