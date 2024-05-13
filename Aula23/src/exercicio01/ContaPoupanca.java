package exercicio01;

public class ContaPoupanca extends ContaBancaria {

    private float taxaJuros;

    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, float taxaJuros) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(float valor) throws Exception {

        if (valor > saldo) {

            throw new Exception("\nO valor do saque não pode ser superior ao saldo: R$ " + saldo);
        }

    }

    @Override
    public void exibirSaldo() {

        System.out.println("\nConta poupança nº: " + numeroConta);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo atual R$: " + saldo);
        System.out.println("Taxa de juros ao mês: " + taxaJuros);
        System.out.println("Rendimento previsto para o mês: R$ " + (saldo * (taxaJuros / 100)));
    }

}
