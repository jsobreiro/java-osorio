public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("Informe um valor inteiro: ");
        int valor = Console.lerInt();

        System.out.print("Informe outro valor inteiro: ");
        int valor2 = Console.lerInt();

        try {
            int result = Calculadora.somarPositivos(valor, valor2);
            System.out.println("Soma dos valores inteiros: " + result);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("\nO programa foi finalziado...");
        }

    }
}
