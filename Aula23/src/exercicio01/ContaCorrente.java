package exercicio01;

public class ContaCorrente extends ContaBancaria {

    private float chequeEspecial;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, float chequeEspecial) {
        super(nomeCliente, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(float valor) throws Exception {

        if (valor > (saldo + chequeEspecial)) {

            throw new Exception("\nO valor do saque é superior ao limite disponível.");
        }

        saldo -= valor;
        System.out.println("\nO valor R$ " + valor +
                " foi sacado da conta " + numeroConta);
    }

    @Override
    public void exibirSaldo() {

        System.out.println("\nConta corrente nº: " + numeroConta);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo atual R$: " + saldo);
        System.out.println("Cheque especial: R$ " + chequeEspecial);
        System.out.println("Total disponível para saque: R$ " +
                (saldo + chequeEspecial));

    }

}