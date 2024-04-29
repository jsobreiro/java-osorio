public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nSistema de Combate");
        System.out.println("1) Cadastrar Herói");
        System.out.println("2) Cadastrar Vilão");
        System.out.println("3) Listar Personagens");
        System.out.println("4) Listar Heróis");
        System.out.println("5) Listar Vilões");
        System.out.println("0) Sair");
        System.out.print("Informe uma Opção: ");

        /*
         * TODO: Concentrar as lógicas dos métodos listarPersonagens,
         * listarHerois e listarViloes em um único método.
         */
    }

    private static void cadastrarHeroi() {

        System.out.println("\nCadastro de Herói");
        System.out.println("Nome: ");
        String nome = Console.lerString();

        System.out.println("Pontos de vida iniciais: ");
        int pstsVida = Console.lerInt();

        System.out.println("Classe do herói: ");
        String classe = Console.lerString();

        Heroi h = new Heroi(nome, pstsVida, classe);

        Cadastro.cadastrarPersonagem(h);

        System.out.println("\nHerói cadastrado com sucesso!");

    }

    private static void cadastrarVilao() {

        System.out.println("\nCadastro de Vilão");
        System.out.println("Nome: ");
        String nome = Console.lerString();

        System.out.println("Pontos de vida iniciais: ");
        int pstsVida = Console.lerInt();

        System.out.println("Nível de dificuldade: ");
        int nivel = Console.lerInt();

        Vilao v = new Vilao(nome, pstsVida, nivel);

        Cadastro.cadastrarPersonagem(v);

        System.out.println("\nVilão cadastrado com sucesso!");

    }

    private static void listarPersonagens() {

        if (Cadastro.verificarListaVazia()) {

            System.out.println("\nNão há personagens cadastrados");
            return;
        }

        System.out.println("\nLista de Personagens Cadastrados");

        for (Personagem tempPersonagem : Cadastro.listarPersonagens()) {

            System.out.println(tempPersonagem);
        }

    }

    private static void listarHerois() {

        if (Cadastro.verificarListaVazia()) {

            System.out.println("\nNão há personagens cadastrados");
            return;
        }

        if (!Cadastro.verificarHeroisNaLista()) {

            System.out.println("\nNão há heróis cadastrados");
            return;
        }

        System.out.println("\nHeróis cadastrados:");

        for (Personagem tempPersonagem : Cadastro.listarPersonagens()) {

            if (tempPersonagem instanceof Heroi) {

                System.out.println(tempPersonagem);
            }

        }

    }

    private static void listarViloes() {

        if (Cadastro.verificarListaVazia()) {

            System.out.println("\nNão há personagens cadastrados");
            return;
        }

        if (!Cadastro.verificarViloesNaLista()) {

            System.out.println("\nNão há vilões cadastrados");
            return;
        }

        System.out.println("\nVilões cadastrados:");

        for (Personagem tempPersonagem : Cadastro.listarPersonagens()) {

            if (tempPersonagem instanceof Vilao) {

                System.out.println(tempPersonagem);
            }

        }

    }

    private static void verificarOpcao(int op) {

        switch (op) {

            case 1:
                cadastrarHeroi();
                break;

            case 2:
                cadastrarVilao();
                break;

            case 3:
                listarPersonagens();
                break;

            case 4:
                listarHerois();
                break;

            case 5:
                listarViloes();
                break;

            case 0:
                System.out.println("\nSistema finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }

    }

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
