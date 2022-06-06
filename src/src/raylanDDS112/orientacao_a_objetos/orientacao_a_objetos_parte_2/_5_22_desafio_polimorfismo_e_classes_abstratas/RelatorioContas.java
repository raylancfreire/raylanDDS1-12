package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");


        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }

        System.out.println("*************************************");
    }

}
