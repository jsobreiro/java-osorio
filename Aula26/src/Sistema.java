import java.io.IOException;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nRelogio System");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar");
        System.out.println("3) Apagar");
        System.out.println("4) Listar todos");
        System.out.println("0) Sair");

    }

    private static void cadastrar() {

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

    }

    private static void buscar() {

        int codigo = Console.lerInt("Informe o codigo do Relógio:");

        try {

            Relogio relogio = GerenciadorRelogio.buscarRelogio(codigo);

            System.out.println("\nRelógio localizado:");
            System.out.println(relogio.exibirDados());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void apagar() {

        int codigo = Console.lerInt("Informe o codigo do Relógio:");

        try {

            GerenciadorRelogio.apagarRelogio(codigo);

            System.out.println("\nRelógio excluído com sucesso!");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void listarTodos() {

        System.out.println("\nRelógios Cadastrados:");

        try {

            for (Relogio tempRelogio : GerenciadorRelogio.lerArquivo()) {

                System.out.println(tempRelogio.exibirDados() + "\n");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void executar() {

        while (true) {

            exibirMenu();
            int op = Console.lerInt("Informe uma opção:");

            switch (op) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    buscar();
                    break;

                case 3:
                    apagar();
                    break;

                case 4:
                    listarTodos();
                    break;

                case 0:
                    System.out.println("\nO sistema foi finalizado");
                    System.exit(0); // finaliza a execução do programa
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        }

    }

}
