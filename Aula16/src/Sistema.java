public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Cadastrar Programador");
        System.out.println("2) Cadastrar Gerente");
        System.out.println("3) Procurar Funcionario");
        System.out.println("4) Listar Todos");
        System.out.println("5) Excluir Funcionário");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void cadastrarProgramador() {

        System.out.println("\nNovo Programador:");
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Linguagens que domina:");
        String linguagens = Console.lerString();

        Programador p = new Programador(matricula, nome, linguagens);

        Cadastro.cadastrar(p);

        System.out.println("\nProgramador cadastrado com sucesso!");

    }

    private static void cadastrarGerente() {

        System.out.println("\nNovo Gerente:");

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Projeto que gerencia:");
        String nomeProjeto = Console.lerString();

        Gerente g = new Gerente(matricula, nome, nomeProjeto);

        Cadastro.cadastrar(g);

        System.out.println("\nGerente cadastrado com sucesso!");

    }

    private static void procurarFuncionario() {

        System.out.println("\nProcurar Funciomário:");

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        // enviar a matricula digitada como parametro para o
        // metodo buscar da classe Cadastro.
        // Este método retornará ou um objeto do tipo Funcinario,
        // ou null, se não encontrar funcionario com a mesma matricula informada
        Funcionario f = Cadastro.buscar(matricula);

        if (f != null) {

            System.out.println("\nFuncionário Localizado:");
            System.out.println(f.toString());
            return;

        }

        System.out.println("\nFuncionário " + matricula + " não foi encontrado");

    }

    private static void listarFuncionarios() {

        System.out.println("\nTodos os funcionários Cadastrados:");

        // Se o tamanho da lista for igual a 0 (zero)
        if (Cadastro.getListaFuncionarios().size() == 0) {

            System.out.println("\nNão há fucionários cadastrados...");
            return; // finaliza o método

        }

        // caso contrário, percorre a lista e msotra os funcionarios um a um
        for (Funcionario temp : Cadastro.getListaFuncionarios()) {

            System.out.println(temp.toString());

        }
    }

    private static void excluirFuncionario() {

        System.out.print("\nInforme a matricula do func. que deseja excluir: ");
        int matricula = Console.lerInt();

        Funcionario f2 = Cadastro.buscar(matricula);

        if (f2 == null) {
            System.out.println("\nFuncionário " + matricula + " não foi encontrado");
            return;
        }

        Cadastro.excluir(f2);

        System.out.println("\nFuncionário excluído com sucesso!");

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:

                cadastrarProgramador();

                break;

            case 2:

                cadastrarGerente();

                break;

            case 3:

                procurarFuncionario();

                break;

            case 4:

                listarFuncionarios();

                break;

            case 5:

                excluirFuncionario();

                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
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