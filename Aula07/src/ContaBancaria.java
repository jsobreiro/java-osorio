public class ContaBancaria {

    // Atributos
    private int numeroConta;
    private String titularConta;
    private float saldo;

    // Construtores
    public ContaBancaria() { // construtor padrão

    }

    public ContaBancaria(int numeroConta, String titularConta, float saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    // Setter e Getters:
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    // métodos próprios
    // Exibir todos os dados da conta diretamente
    public void exbirDadosConta() {
        System.out.println("\nConta Nº " + numeroConta);
        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println();
    }

    public void sacar(float valor) {
        System.out.println("Sacando " + valor + " da conta " + numeroConta);
        saldo -= valor;
        exbirDadosConta();
    }

    public void depositar(float valor) {
        System.out.println("Depositando " + valor + " da conta " + numeroConta);
        saldo += valor;
        exbirDadosConta();
    }

}
