package src.raylanDDS112.orientacao_a_objetos.wrappers_boxing_e_arrays.exercicio03;

public class Estoque {
    Produto[] produtos;
    void listarProdutos() {
        System.out.println("\nProdutos em estoque");
        System.out.println("---------------------");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].descrever();
        }
    }
}