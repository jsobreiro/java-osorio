import java.util.Scanner;

public class Aula04 {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {
            System.out.println("\nEXEMPLO VETORES:");
            System.out.println("1) Exemplo 1");
            System.out.println("2) Exemplo 2");
            System.out.println("3) Exemplo 3");
            System.out.print("Informe a opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exVetor01();
                    break;

                case 2:
                    exVetor02();
                    break;

                case 3:
                    exVetor03();
                    break;

                case 0:
                    System.out.println("\nPROGRAMA FINALIZADO...");
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    break;
            }

            System.out.println(); // quebra de linha adicional

        } while (op != 0);
    }

    public static void exVetor01() {

        /*
         * Ler 5 valores inteiros e armazena-los em um vetor.
         * Mostrar os valores do vetor.
         */

        System.out.println("\nExemplo Vetor 01:");

        // declaração de vetor
        int[] bolinho = new int[5];

        for (int i = 0; i < bolinho.length; i++) {

            System.out.print("Informe valor para a pos " + i + ": ");
            bolinho[i] = leitor.nextInt();
        }

        System.out.println("\nVetor Gerado:");

        for (int i = 0; i < bolinho.length; i++) {

            System.out.print(bolinho[i] + " ");

        }

    }

    public static void exVetor02() {

        /*
         * Leia um valor inteiro entre 2 e 10.
         * Enquando for digitado um valor fora desse intervalo,
         * solicite ao usuário para digitar novamente.
         * Crie um vetor com o mesmo tamanho do valor lido.
         * Leia os valores e depois apresente apenas os valres pares do
         * vetor na tela
         */

        System.out.println("\nExemplo Vetor 02:");
        int tamanho;

        do {
            System.out.print("Informe o tamanho do vetor (entre 2 e 10): ");
            tamanho = leitor.nextInt();
        } while (tamanho < 2 || tamanho > 10);

        int[] vetor = new int[tamanho];

        System.out.println("\nLeitura do vetor de " + tamanho + " pos: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Pos " + i + ": ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("\nValores pares do vetor:");
        for (int i = 0; i < vetor.length; i++) {

            // mostrar apenas valores pares
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }

        }

    }

    public static void exVetor03() {

        /*
         * Criar um vetor de 5 posições com valores definidos em
         * sua declaração. Mostrar na tela apenas os valores que
         * sejam menores que os seus índices
         */

        int[] vet = { 10, 5, 1, 2, 45 };

        System.out.println("\nExemplo Vetor 03:");
        System.out.println("\nValores menores que seus índices:");

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] < i) {
                System.out.println("Pos: " + i + " - Valor: " + vet[i]);
            }
        }

    }

}