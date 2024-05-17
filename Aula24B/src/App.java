import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

    private static void exibirMenu() {

        System.out.println("\nAgenda de Contatos");
        System.out.println("1) Salvar Contato");
        System.out.println("2) Buscar ");
        System.out.println("3) Listar Todos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    public static void verificarOpcao(int op) {

        switch (op) {
            case 1: // cadastrar

                System.out.println("\nNovo contato:");
                System.out.print("Código: ");
                int codigo = Console.lerInt();

                System.out.print("Nome: ");
                String nome = Console.lerString();

                System.out.print("E-mail: ");
                String email = Console.lerString();

                Contato c = new Contato(codigo, nome, email);

                try {

                    Agenda.salvarContato(c);
                    System.out.println("\nContato foi salvo com sucesso!");

                } catch (IOException e) {

                    System.out.println(e.getMessage());
                }

                break;

            case 2: // buscar

                System.out.println("\nBuscar contato");
                System.out.print("Informe o código do contato: ");
                int codigo2 = Console.lerInt();

                try {

                    Contato c2 = Agenda.buscarContato(codigo2);
                    System.out.println("\nContato localizado: " + c2);

                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }

                break;

            case 3: // listar

                System.out.println("\nContatos Salvos:");

                try {

                    for (Contato tempContato : Agenda.lerAgenda()) {

                        System.out.println(tempContato);

                    }

                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }

                break;

            case 0:
                System.out.println("\nO sistema foi finalizado\n");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }
}
