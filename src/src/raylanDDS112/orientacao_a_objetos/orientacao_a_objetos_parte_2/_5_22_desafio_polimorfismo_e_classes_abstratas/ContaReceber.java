package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class ContaReceber extends Conta {
    private Cliente cliente;
    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void exibirDetalhes(){
        System.out.println("Nome da conta" + this.getDescricao() +
                "Valor da Conta: " + this.getValor() +
                "Data de Vencimento: " + this.getDataVencimento() +
                "Nome do Cliente: " + this.getCliente());
    }
    public void cancelar(){
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. " +
                    this.getValor() + " É muito dinheiro para deixar de receber: " +
                    this.getDescricao() + ".");
        } else {
            super.cancelar();
        }
    }
    public void receber () {
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está paga: "
            + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: "
            + this.getDescricao() + ".");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");
        this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
