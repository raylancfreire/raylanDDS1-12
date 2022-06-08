package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_23_interface;

public class TesteInterface {

    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("raylancfreire@hotmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");
    }
}
