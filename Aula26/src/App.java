import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nCadastro de Relógio");
        int codigo = Console.lerInt("Informe o código:");
        String marca = Console.lerString("Marca:");
        String modelo = Console.lerString("Modelo:");
        String tipo = Console.lerString("Tipo");

        Relogio relogio = new Relogio(codigo, marca, modelo, tipo);

        try {
            GerenciadorRelogio.salvarRelogio(relogio);
            System.out.println("\nRelógio foi salvo!");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("\nRelógios Cadastrados:");

        try {

            for (Relogio tempRelogio : GerenciadorRelogio.lerArquivo()) {

                System.out.println(tempRelogio.exibirDados() + "\n");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
