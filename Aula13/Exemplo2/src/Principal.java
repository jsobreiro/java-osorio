public class Principal {

    public static void main(String[] args) {

        int op;
        String modelo;
        String placa;

        do {

            System.out.println("\nEstacionamento - Menu Principal");
            System.out.println("1) Estacionar Carro");
            System.out.println("2) Liberar Carro");
            System.out.println("3) Listar carros estacionados");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    System.out.println("\nDados do carro:");
                    System.out.print("Marca/Modelo: ");
                    modelo = Console.lerString();
                    System.out.print("Placa: ");
                    placa = Console.lerString();

                    Carro carro = new Carro(modelo, placa);

                    Estacionamento.estacionarCarro(carro);

                    break;

                case 2:

                    System.out.print("\nPlaca do carro para liberar:");
                    placa = Console.lerString();

                    Estacionamento.liberarCarro(placa);

                    break;

                case 3:

                    System.out.println("\nCarros estacionados:");

                    Estacionamento.mostrarCarrosEstacionados();

                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado...\n");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }

        } while (op != 0);

    }
}