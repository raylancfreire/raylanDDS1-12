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
    public void exibirDetalhes() {
        System.out.println("\nConta a Receber");
        System.out.println("=================================");
        System.out.println("Fornecedor: " + getCliente().getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Data de vencimento: " + getDataVencimento());
        System.out.println("Situação: " + getSituacaoConta());
        System.out.println("=================================");
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
