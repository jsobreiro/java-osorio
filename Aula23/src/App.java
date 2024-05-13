import exercicio01.ContaCorrente;
import exercicio01.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        exercicio01();

    }

    private static void exercicio01() {

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

        ///// TESTES COM CONTA POUPANÇA
        ContaPoupanca cp = new ContaPoupanca("Beltrano Souza",
                1235, 1000, 0.75f);

        cp.exibirSaldo();

        cp.depositar(300);

        try {
            cp.sacar(3000);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
