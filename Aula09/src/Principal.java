public class Principal {

    public static void main(String[] args) {

        // Agenda que será utilizada no projeto:
        Agenda agenda = new Agenda();

        // Objeto do tipo "Contato" que será lido sempre que precisarmos de um
        // novo contato:
        Contato temp;

        // variável para ler a opção desejada no menu:
        int op;

        // Nome que será digitado na hora do cadastro e para a busca de contatos:
        String nome;

        // Telefone que será digiado na hora do cadastro:
        String telefone;

        do {

            // Menu do sistema
            System.out.println("AGENDA DE CONTATOS");
            System.out.println("1) Salvar Contato");
            System.out.println("2) Buscar Contato pelo nome");
            System.out.println("3) Apagar agenda");
            System.out.println("0) Sair");
            System.out.print("Informe sua opção: ");
            op = Console.lerInt(); // entrada de dados para "op"

            // teste dos possíveis valores para "op":
            switch (op) {
                case 1:

                    System.out.println("\nNOVO CONTATO");
                    System.out.print("Nome: ");
                    nome = Console.lerString();
                    System.out.print("Fone: ");
                    telefone = Console.lerString();

                    // inicialiando objeto "temporário" como um novo objeto
                    temp = new Contato(nome, telefone);

                    // salvando contato "temp" na agenda:
                    agenda.salvarContato(temp);

                    break;

                case 2:

                    System.out.println("\nBUSCAR CONTATO");
                    System.out.print("Informe o nome do contato: ");
                    nome = Console.lerString();

                    // buscar contato na agenda
                    agenda.buscarContato(nome);

                    break;

                case 3:

                    System.out.println("\nAPAGAR DADOS DA AGENDA");
                    agenda.limparAgenda();

                    break;

                case 0:

                    System.out.println("\nO programa foi finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente.\n");
                    break;
            }

            // quebra de linha adicional antes de exibir o menu novamente:
            System.out.println();

        } while (op != 0);

    }

}
