import java.util.Scanner;

public class Aula03 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {

            System.out.println("\nAULA 03");
            System.out.println("1) Exemplo FOR");
            System.out.println("2) Exemplo While");
            System.out.println("3) Exemplo Do/While");
            System.out.println("0) Sair");

            System.out.print("Informe a opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exemploFor();
                    break;

                case 2:
                    exemploWhile();
                    break;

                case 3:
                    exemploDoWhile();
                    break;

                case 0:
                    System.out.println("\nPROGRAMA FINALIZADO...");
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    break;
            }

            System.out.println(); // QUEBRA DE LINHA

        } while (op != 0);

    }

    public static void exemploFor() {
        /*
         * Ler um valor inteiro e apresentar a tabuada dele
         * (do x1 ao x10)
         */

        System.out.println("EXEMPLO FOR");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        System.out.println("\nTabuada do " + valor);

        for (int cont = 1; cont <= 10; cont++) {

            System.out.println(valor + " x " + cont + " = " + (cont * valor));
        }
    }

    public static void exemploWhile() {

        /*
         * Mostrar todos os valores entre o valor digitado e 100
         */
        System.out.println("\nExemplo While");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        if (valor > 100) {
            System.out.println("Valor informado é maior que 100");
        }

        while (valor <= 100) {

            System.out.println("Valor atual: " + valor);
            valor++; // valor = valor + 1;
        }

    }

    public static void exemploDoWhile() {

        /*
         * Ler um valor inteiro entre 1 e 10.
         * Enquanto o valor informado estiver fora do intervalo solicidato,
         * pedir para o usuário digitar novamente.
         * Ao final, informar se o valor digitado é par ou ímpar
         */
        System.out.println("\nExemplo Do/While");

        int valor;

        do {

            System.out.print("Informe um valor inteiro entre 1 e 10: ");
            valor = leitor.nextInt();

        } while (valor < 1 || valor > 10);

        if (valor % 2 == 0) {
            System.out.println("Valor informado é par");
        } else {
            System.out.println("Valor informado é ímpar");
        }

    }

}
