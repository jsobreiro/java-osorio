import exercicio01.ContaCorrente;

public class App {
    public static void main(String[] args) throws Exception {

        // nova instancia da classe ContaCorrente:
        ContaCorrente cc = new ContaCorrente("Fulano da Silva",
                1234, 2500, 500);

        // Exibindo saldo atual do objeto 'cc'
        cc.exibirSaldo();

        // Depositando 300 reais na conta
        cc.depositar(300);

        // tentar realizar saque de 600 reais
        try {
            cc.sacar(600);
        } catch (Exception e) {
            // se exceder o limite disponível para saque, a exceção será lançanda:
            System.out.println(e.getMessage());
        }

        // Exibindo saldo atual do objeto 'cc'
        cc.exibirSaldo();

        // Tentar realizar saque de 5000 reais
        try {
            cc.sacar(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        cc.exibirSaldo();

    }
}
