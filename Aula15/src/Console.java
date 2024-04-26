import java.util.Scanner;

public class Console {

    // private: apenas esta classe enxerga o "leitor"
    // static: esta classe gerencia o "leitor"
    private static Scanner leitor = new Scanner(System.in);

    // método para ler e retornar um valor String:
    public static String lerString() {
        String valor = leitor.nextLine();
        return valor;
    }

    // método para ler e retornar um valor int:
    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine(); // limpeza de buffer
        return valor;
    }

    // método para ler e retornar um valor float:
    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine(); // limpeza de buffer
        return valor;
    }

}
