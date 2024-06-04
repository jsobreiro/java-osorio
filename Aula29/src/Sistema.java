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

    
    private static void buscarObra(int modo) {

        /*
         * modo:
         * 3 = apagar
         * 2 = editar
         * 1 ou default = exibir
         */
        
        try {
            
            GerenciadorObrasArte.verificarListaVazia();
            
            String titulo = Console.lerString("Informe o título:");

            ObraArte busca = GerenciadorObrasArte.buscarObra(titulo);

            switch (modo) {
                case 3: // apagar obra de arte

                    GerenciadorObrasArte.excluirObra(busca);

                    ObraPersistencia.salvarNoArquivo();

                    System.out.println("\nObra de arte " + busca.getTitulo() + " excluída com sucesso!");

                    break;

                case 2: // editar dados da obra de arte

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

                    System.out.println("\nObra atualizada: " + busca.exibirDados() + "\n");

                    break;
            
                case 1: // exbir dados da obra de arte
                default: // idem a opção 1
                    
                    System.out.println("\nObra localizada: " + busca.exibirDados());
                    break;
            }


        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarTodos() {

        ArrayList<ObraArte> listaObras = GerenciadorObrasArte.getListaObras();

        try {
            GerenciadorObrasArte.verificarListaVazia();
            
            System.out.println("\nObras Cadastradas:");
            for (ObraArte obraArte : listaObras) {
    
                System.out.println(obraArte.exibirDados());
            }

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        

    }

    private static void verificarOpcaoMenu(int opcao) {

        switch (opcao) {
            case 1:
                cadastrarObra();
                break;

            case 2:
                buscarObra(1); // exibir
                break;

            case 3:
                buscarObra(2); // editar
                break;

            case 4:
                buscarObra(3); // apagar
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
