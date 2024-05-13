package exercicio01;

public abstract class ContaBancaria {

    protected String nomeCliente;
    protected int numeroConta;
    protected float saldo;

    public ContaBancaria(String nomeCliente, int numeroConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract void sacar(float valor) throws Exception;

    public abstract void depositar(float valor);

    public abstract void exibirSaldo();

}
