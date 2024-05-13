import exercicio01.ContaCorrente;
import exercicio01.ContaPoupanca;
import exercicio02.ProdutoAlimenticio;
import exercicio02.ProdutoEletronico;

public class App {
    public static void main(String[] args) throws Exception {

        // exercicio01();
        exercicio02();

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

    private static void exercicio02() {

        ProdutoEletronico pe = new ProdutoEletronico(123,
                "LG GS8 Think Q", 15,
                "Smart Phone");

        ProdutoAlimenticio pa = new ProdutoAlimenticio(1356,
                "Achocolatado", 50,
                "2024-11-12");

        System.out.println();

        try {
            pe.adicionarItem(10); // funciona
            pa.adicionarItem(-2); // fornçando erro

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {
            pa.removerItem(10); // funciona
            pe.removerItem(100); // forçando o erro

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        pe.exibirItem();
        pa.exibirItem();

    }

}
