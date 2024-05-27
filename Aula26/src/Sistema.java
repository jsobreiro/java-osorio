import java.io.IOException;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nRelogio System");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar");
        System.out.println("3) Apagar");
        System.out.println("4) Listar todos");
        System.out.println("5) Atualizar");
        System.out.println("6) Apagar todos");
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

            for (Relogio tempRelogio : GerenciadorRelogio.getListaRelogios()) {

                System.out.println(tempRelogio.exibirDados() + "\n");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    private static void atualizar() {

        System.out.println("\nAtualizar Relógio");

        int codigo = Console.lerInt("Informe o codigo do Relógio:");

        try {

            Relogio tempRelogio = GerenciadorRelogio.buscarRelogio(codigo);

            String marca = Console.lerString("Informe a nova marca:");
            String nome = Console.lerString("Informe o novo nome:");
            String tipo = Console.lerString("Informe o novo tipo:");

            tempRelogio.setMarca(marca);
            tempRelogio.setNome(nome);
            tempRelogio.setTipo(tipo);

            GerenciadorRelogio.atualizarRelogio(tempRelogio);

            System.out.println("\nRelógio " + codigo + " atualizado com sucesso!");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void apagarTodos() {

        try {

            GerenciadorRelogio.apagarTodos();
            System.out.println("\nATENÇÃO: Todos os relógios foram apagados do arquivo!");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static void executar() {

        try {
            GerenciadorRelogio.lerArquivo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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

                case 5:
                    atualizar();
                    break;

                case 6:
                    apagarTodos();
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
