package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_23_interface;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{


    private int numero;

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    public void adicionarPedido(String produto) {

    }
    @Override
    public void imprimir() {

        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);

    }
    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota do número: " + numero + " para o email: " + email);
    }
}
