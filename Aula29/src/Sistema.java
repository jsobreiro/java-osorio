import java.util.ArrayList;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nMuseu System");
        System.out.println("1) Cadastrar Obra de Arte");
        System.out.println("2) Buscar Obra");
        System.out.println("3) Atualziar dados");
        System.out.println("4) Apagar Obra de arte");
        System.out.println("5) Listar todas as obras");
        System.out.println("0) Sair");

    }

    private static void cadastrarObra() {

        System.out.println("\nNova Obra de Arte:");
        String titulo = Console.lerString("Título da obra:");
        String artista = Console.lerString("Artista:");
        int anoCriacao = Console.lerInt("Ano de criação:");
        String tipoObra = Console.lerString("Tipo de obra:");
        String localizacao = Console.lerString("Localização no museu:");

        ObraArte obra = new ObraArte(titulo, artista, anoCriacao, tipoObra, localizacao);

        GerenciadorObrasArte.salvarObra(obra);

        try {

            ObraPersistencia.salvarNoArquivo();
            System.out.println("\nObra de arte foi salva com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void buscarObra() {

        System.out.println("\nBusca de obra por título:");
        String titulo = Console.lerString("Informe o título:");

        try {

            ObraArte busca = GerenciadorObrasArte.buscarObra(titulo);

            System.out.println("\nObra localizada: " + busca.exibirDados());

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void apagarObra() {

        System.out.println("\nApagar obra por título:");
        String titulo = Console.lerString("Informe o título:");

        try {

            ObraArte busca = GerenciadorObrasArte.buscarObra(titulo);

            GerenciadorObrasArte.excluirObra(busca);

            ObraPersistencia.salvarNoArquivo();

            System.out.println("\nObra de arte " + busca.getTitulo() + " excluída com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void atualizarDados() {

        System.out.println("\nAtualizar obra por título:");
        String titulo = Console.lerString("Informe o título:");

        try {

            ObraArte busca = GerenciadorObrasArte.buscarObra(titulo);

            System.out.println("\nInforme os novos dados:");

            titulo = Console.lerString("Título da obra:");
            String artista = Console.lerString("Artista:");
            int anoCriacao = Console.lerInt("Ano de criação:");
            String tipoObra = Console.lerString("Tipo de obra:");
            String localizacao = Console.lerString("Localização no museu:");

            busca.setTitulo(titulo);
            busca.setArtista(artista);
            busca.setAnoCriacao(anoCriacao);
            busca.setTipoObra(tipoObra);
            busca.setLocalizacao(localizacao);

            ObraPersistencia.salvarNoArquivo();

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodos() {

        ArrayList<ObraArte> listaObras = GerenciadorObrasArte.getListaObras();

        if (listaObras.isEmpty()) {

            System.out.println("\nNão há obras cadastradas!");
            return;
        }

        System.out.println("\nObras Cadastradas:");
        for (ObraArte obraArte : listaObras) {

            System.out.println(obraArte.exibirDados());
        }

    }

    private static void verificarOpcaoMenu(int opcao) {

        switch (opcao) {
            case 1:
                cadastrarObra();
                break;

            case 2:
                buscarObra();
                break;

            case 3:
                atualizarDados();
                break;

            case 4:
                apagarObra();
                break;

            case 5:
                listarTodos();
                break;

            case 0:
                System.out.println("\nSistema finalizado...\n");
                System.exit(0); // força a finalização do programa
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }

    public static void executar() {

        try {

            ObraPersistencia.criarArquivoSeNaoExistir();
            ObraPersistencia.lerDoArquivo();

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        while (true) {

            exibirMenu();
            int opcao = Console.lerInt("Informe uma opção:");
            verificarOpcaoMenu(opcao);

        }

    }

}
